import org.apache.commons.codec.binary.Base64;
import org.jnbis.api.Jnbis;
import sun.misc.BASE64Decoder;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class DactilarExample {

    public static void main(String[] args) throws Exception {
        System.out.println("Hola nuevo proyecto");

        /*File png = Jnbis.wsq().decode("C:\\Users\\Tesseract\\Documents\\Dactilar\\DactilarExample\\src\\main\\resources\\sample2.wsq")
                .toPng().asFile("C:\\Users\\Tesseract\\Documents\\Dactilar\\DactilarExample\\src\\main\\resources\\huella2.png");*/

       /* InputStream pngStream = Jnbis.wsq().decode("C:\\Users\\Tesseract\\Documents\\Dactilar\\DactilarExample\\src\\main\\resources\\sample2.wsq")
                .toPng().asInputStream();*/
        
        /*String huella = Jnbis.wsq().decode("C:\\Users\\Tesseract\\Documents\\Dactilar\\DactilarExample\\src\\main\\resources\\sample2.wsq")
                .toString();*/



        //System.out.println(huella);

       // System.out.println(convertToString(pngStream));

       /* File file = new File("C:\\Users\\Tesseract\\Documents\\Dactilar\\DactilarExample\\src\\main\\resources\\huella.png");
        String encodeString =  encodeFileTobase64(file);
        System.out.println(encodeString);

        BufferedImage image = null;
        byte[] imagebytes;

        BASE64Decoder decoder  = new BASE64Decoder();
        imagebytes = decoder.decodeBuffer(encodeString);
        ByteArrayInputStream bis = new ByteArrayInputStream(imagebytes);
        image = ImageIO.read(bis);
        bis.close();

        File output = new File("C:\\Users\\Tesseract\\Documents\\Dactilar\\DactilarExample\\src\\main\\resources\\image2.png");
        ImageIO.write(image,"png",output);*/

        /*byte[] gifBytes = Jnbis.wsq().decode(new File("C:\\Users\\Tesseract\\Documents\\Dactilar\\DactilarExample\\src\\main\\resources\\sample2.wsq"))
                .toPng().asByteArray();

        for(byte  b : gifBytes){
            System.out.print(b);
        }
*/

        


    }

    public static  String convertToString(InputStream inputStream) throws  IOException{
        ByteArrayOutputStream result = new ByteArrayOutputStream();
        byte[] buffer = new byte[1024];
        int length;
        while ((length = inputStream.read(buffer)) != -1) {
            result.write(buffer, 0, length);
        }

        return result.toString(StandardCharsets.UTF_8.name());
    }

    public static String encodeFileTobase64(File file) throws Exception{
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] bytes = new byte[(int)file.length()];
        fileInputStream.read(bytes);
        return new String(Base64.encodeBase64(bytes),"UTF-8");
    }

}
