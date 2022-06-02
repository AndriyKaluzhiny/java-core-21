package ua.lviv.lgs;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Field;

public class Application {
	public static void main(String[] args) throws IOException {
		Car c = new Car();
		File file = new File("Annotated fields");
		Field[] f = c.getClass().getDeclaredFields();
		OutputStream os = new FileOutputStream(file);
		for (int i = 0; i < f.length; i++) {
			if (f[i].getAnnotation(CarAnnotation.class) instanceof CarAnnotation) {
				os.write(f[i].toString().getBytes());
			}
		}
		os.close();
	}
}
