import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;


import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.io.File;
import java.nio.file.Files;
public class SimpleHttpServer {

    public static void main(String[] args) throws IOException {
        // Criar um servidor HTTP na porta 8000
        HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);

        // Adicionar um manipulador (handler) para lidar com as requisições
        server.createContext("/", new MyHandler());

        // Iniciar o servidor
        server.start();

        System.out.println("Servidor iniciado em http://localhost:8000/");
    }

    static class MyHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange exchange) throws IOException {
            // Ler o conteúdo do arquivo HTML
            File file = new File("C:/Users/Lohan/IdeaProjects/AuaJavakipper/src/pagina.html");
            byte[] fileContent = Files.readAllBytes(file.toPath());

            // Configurando cabeçalhos e enviando o conteúdo do arquivo HTML
            exchange.sendResponseHeaders(200, fileContent.length);
            OutputStream os = exchange.getResponseBody();
            os.write(fileContent);
            os.close();
        }
    }
}
