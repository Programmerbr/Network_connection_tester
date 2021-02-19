import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Scanner;

public class NetworkConnectivityTester {
       public static void main (String[] args){

           byte[] ipAddress = new byte[] {8,8,8,8};

           Scanner scan = new Scanner(System.in);
           char answer;

           try {
               System.out.println("Computer Name: " + InetAddress.getLocalHost().getHostName());
               System.out.println("IP Address: " + InetAddress.getLocalHost().getHostAddress());
               System.out.println("Loopback address: " + InetAddress.getLoopbackAddress());


               //Check if google server is reachable or not.
               System.out.println("Connection Status: " + InetAddress.getByAddress("googleDnsServer", ipAddress).isReachable(50));

           } catch (Exception e) {

               System.out.println("Your connection seems to be lost.");
           }

           // Test connectivity and return results
           try {
               InetAddress[] addresses = InetAddress.getAllByName("www.facebook.com");

               for (InetAddress address : addresses) {
                   if (address.isReachable(1000)) {
                       System.out.println("\nConnected: The network was able to establish a connection to " + address);
                   }

               }
           } catch (Exception e) {

               System.out.println("\n\n***Failed to establish connection***");

               System.out.println("\nThe network is not working properly. Please, follow the next steps: ");

               System.out.println("\nReboot your computer and try to connect.");

               System.out.println("\nDid that fixed the problem? Type y/n");

               answer = scan.next().charAt(0);

               if (answer == 'y') {
                   System.out.println("\nThe network connectivity was fixed. \nThank you!");
               return;
               }
                   else

                   System.out.println("\nReboot the router and try to connect.");

                   System.out.println("\nDid that fixed the problem? Type y/n");

                   answer = scan.next().charAt(0);

                        if (answer == 'y') {
                        System.out.println("\nThe network connectivity was fixed. \nThank you!");
                            return;
                        }

                        else

                            System.out.println("\nMake sure the cables connecting the router are firmly plugged in and power is getting to the router.");

                            System.out.println("\nDid that fixed the problem? Type y/n");

                            answer = scan.next().charAt(0);

                                if (answer == 'y') {
                                System.out.println("\nThe network connectivity was fixed. \nThank you!");
                                    return;
                                }

                                else

                                    System.out.println("\nMove the computer closer to the router and try to connect.");

                                    System.out.println("\nDid that fixed the problem? Type y/n");

                                    answer = scan.next().charAt(0);

                                    if (answer == 'y') {
                                    System.out.println("\nThe network connectivity was fixed. \nThank you!");
                                    return;
                                    }

                                    else

                                        System.out.println("\nContact your ISP.");









           }
           }

       }






