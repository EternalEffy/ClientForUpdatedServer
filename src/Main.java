import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       System.out.println(ClientMessages.MESSAGE_SET_NAME);
       Client client = new Client(new Scanner(System.in).nextLine());
       client.loadClient(3310);

    /*  client.request(Requests.add,"{\"request\":\""+Requests.add+"\"," +
                "\"userData\":"+"[\"Dielit\",\"20\",\"110\",\"20\"]}","0");
        client.request(Requests.add,"{\"request\":\""+Requests.add+"\"," +
                "\"userData\":"+"[\"Effy\",\"23\",\"299\",\"23\"]}","1");
        client.request(Requests.stop,"{\"request\":\""+Requests.stop+"\"," +
                "\"userData\":"+"[\"Linda\",\"21\",\"58\",\"10\"]}","0");

        client.request(Requests.edit,"{\"request\":\""+Requests.edit+"\"," +
                "\"userData\":"+"[\"Alex\",\"100\",\"100\",\"200\"]}","0");
        client.request(Requests.get,"{\"request\":\""+Requests.get+"\"," +
                "\"userData\":"+"[\"Linda\",\"21\",\"58\",\"10\"]}","0");
        client.request(Requests.remove,"{\"request\":\""+Requests.remove+"\"," +
                "\"userData\":"+"[\"Linda\",\"21\",\"58\",\"10\"]}","1");
                client.request(Requests.get,"{\"request\":\""+Requests.get+"\"," +
                "\"userData\":"+"[\"Linda\",\"21\",\"58\",\"10\"]}","110");
                client.request(Requests.stop,"{\"request\":\"" + Requests.stop + "\"," +
                "\"userData\":" + "[\"Linda\",\"21\",\"58\",\"10\"]}", "0");

                for(int i=0;i<100000;i++){
            client.request(Requests.add,"{\"request\":\""+Requests.add+"\"," +
                    "\"userData\":"+"[\""+ Generator.generateUserName()+"\",\""+Generator.generateAge()+"\",\""+Generator.generateScore()+"\",\""+Generator.generateLevel()+"\"]}",String.valueOf(i));
        }

                for(int i=0;i<15;i++) {
            client.request(Requests.get, "{\"request\":\"" + Requests.get + "\"," +
                    "\"userData\":" + "[\"Linda\",\"21\",\"58\",\"10\"]}", String.valueOf(i));
        }
        client.request(Requests.stop,"{\"request\":\"" + Requests.stop + "\"," +
                "\"userData\":" + "[\"Linda\",\"21\",\"58\",\"10\"]}", "0");


     */

        for(int i=0;i<25;i++){
            client.request(Requests.get,"{\"request\":\""+Requests.get+"\"," +
                    "\"userData\":"+"[\""+ Generator.generateUserName()+"\",\""+Generator.generateAge()+"\",\""+Generator.generateScore()+"\",\""+Generator.generateLevel()+"\"]}",String.valueOf(i));
        }


    client.close();

    }
}
