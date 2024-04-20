import com.sun.net.httpserver.*;
import java.io.*;
import java.util.*;
import java.net.*;

public class SimpleAPI {

    private static Map<Integer, String> data = new HashMap<>();

    public static void main(String[] args) throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);
        server.createContext("/data", new DataHandler());
        server.setExecutor(null);
        server.start();
        System.out.println("Server started on port 8000");
    }

    static class DataHandler implements HttpHandler {
    
        @Override
        public void handle(HttpExchange exchange) throws IOException {
            String method = exchange.getRequestMethod();
            switch (method) {
                case "GET":
                    handleGet(exchange);
                    break;

                case "POST":
                    handlePost(exchange);
                    break;

                case "PUT":
                    handlePut(exchange);
                    break;

                case "DELETE":
                    handleDelete(exchange);
                    break;
            
                default:
                    sendResponse(exchange, 405, "Method Not Allowed");
            }
        }

        private void handleGet(HttpExchange exchange) throws IOException {
            String response;
            if (data.isEmpty()) {
                response = "No data available";
            } else {
                response = data.toString();
            }
            sendResponse(exchange, 200, response);
        }

        private void handlePost(HttpExchange exchange) throws IOException {
            String body = Utils.convertStreamToString(exchange.getRequestBody());
            int id = data.size() + 1;
            data.put(id, body);
            sendResponse(exchange, 201, "Data created with ID: " + id);
        }

        private void handlePut(HttpExchange exchange) throws IOException {
            String body = Utils.convertStreamToString(exchange.getRequestBody());
            String[] parts = exchange.getRequestURI().getPath().split("/");
            if (parts.length != 3) {
                sendResponse(exchange, 400, "Invalid request");
                return;
            }
            int id;
            try {
                id = Integer.parseInt(parts[2]);
            } catch (NumberFormatException e) {
                sendResponse(exchange, 400, "Invalid ID format");
                return;
            }
            if (!data.containsKey(id)) {
                sendResponse(exchange, 404, "Data not found");
                return;
            }
            data.put(id, body);
            sendResponse(exchange, 200, "Data updated successfully");
        }

        private void handleDelete(HttpExchange exchange) throws IOException {
            String[] parts = exchange.getRequestURI().getPath().split("/");
            if (parts.length != 3) {
                sendResponse(exchange, 400, "Invalid request");
                return;
            }
            int id;
            try {
                id = Integer.parseInt(parts[2]);
            } catch (NumberFormatException e) {
                sendResponse(exchange, 400, "Invalid ID format");
                return;
            }
            if (!data.containsKey(id)) {
                sendResponse(exchange, 404, "Data not found");
                return;
            }
            data.remove(id);
            sendResponse(exchange, 200, "Data deleted successfully");
        }

        private void sendResponse(HttpExchange exchange, int statusCode, String response) throws IOException {
            exchange.sendResponseHeaders(statusCode, response.getBytes().length);
            OutputStream os = exchange.getResponseBody();
            os.write(response.getBytes());
            os.close();
        }

        static class Utils {
        
            static String convertStreamToString(java.io.InputStream is) {
                java.util.Scanner s = new java.util.Scanner(is).useDelimiter("\\A");
                return s.hasNext() ? s.next() : "";
            }
        }
    }
}