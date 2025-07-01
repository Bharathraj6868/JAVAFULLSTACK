public class Camera
{
static  String cable;
static String memorysize;
static String filesize;
static String battery;
static String picksize;
public static void main(String[] arga){
System.out.println("cable: " + cable);
cable = "hdmi";
System.out.println("cable: " + cable);

System.out.println("memorysize: "  + memorysize);
memorysize = "256gb";
System.out.println("memorysize:" + memorysize);

System.out.println("filesize: " + filesize);
filesize = "10mb";
System.out.println("filesize:" + filesize);

System.out.println("battery: " + battery);
battery = "8000mh";
System.out.println("battery:" + battery);

System.out.println("picksize:" + picksize);
picksize = "10mb";
System.out.println("picksize: " + picksize);

//declaration and init
double price = 0.0;

//re-int
price = 300000.00;
System.out.println("cable:"+cable);
System.out.println("Price of Camera:"+ price);
}
}