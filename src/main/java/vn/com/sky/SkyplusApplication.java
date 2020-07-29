package vn.com.sky;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

//import springfox.documentation.swagger2.annotations.EnableSwagger2WebFlux;
import vn.com.sky.task.services.ReminderService;

@SpringBootApplication
// @EnableSwagger2WebFlux
public class SkyplusApplication {
    private static ApplicationContext applicationContext;
    // static {
    // nu.pattern.OpenCV.loadShared();
    // }

    public static void main(String[] args) {
        applicationContext = SpringApplication.run(SkyplusApplication.class, args);

        // var recognizer = LBPHFaceRecognizer.create();

        // var userDir = System.getProperty("user.dir");
        // var dir = new File(userDir + "/data_set" );
        //
        // var start = SDate.now();
        // //recognizer.save(dir + "/model.yml");
        // recognizer.read(dir + "/model.yml");
        // Mat test = Imgcodecs.imread(dir + "/test/2.100.jpg");
        // Imgproc.cvtColor(test, test, Imgproc.COLOR_RGB2GRAY);
        //
        // int[] resultLabels = new int[2];
        // double[] confidences = new double[2];

        // recognizer.predict(test, resultLabels, confidences);

        // var end = SDate.now();
        // System.out.println("Took " + (end-start));


        var reminderService = applicationContext.getBean(ReminderService.class);
        reminderService.run();
        
    }
}
