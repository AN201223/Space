//Page 391 in the JavaFX Textbook
package spherejavafx;

import javafx.animation.Animation;
import javafx.animation.Interpolator;
import javafx.animation.RotateTransition;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.*;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.*;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.util.Duration;


public class SphereJavaFX extends Application {
    
    @Override
    public void start(Stage primaryStage) {
       
        StackPane root = new StackPane();
        
        //root.getChildren().add(btn);
        Scene scene = new Scene(root, 300, 300);
        PerspectiveCamera camera = new PerspectiveCamera(true);
        
        //Backs the camera away from the scene by 1000 units
        camera.setTranslateZ(-1000);
        
        //This is the range of which the camera will render objects
        camera.setNearClip(0.1);
        camera.setFarClip(2000.0);
        
        //The default field of view for the scene is 30 but change to suit
        camera.setFieldOfView(30);
        scene.setCamera(camera);
        
        //This sets up my sphere
        Rectangle space = new Rectangle(1000,1000);
        root.getChildren().add(space);
        
        Sphere neptune = new Sphere(170);
        neptune.setTranslateX(70);
        neptune.setTranslateY(-350);
        neptune.setTranslateZ(700);
        root.getChildren().add(neptune);
        
        Sphere uranus = new Sphere(150);
        uranus.setTranslateX(100);
        uranus.setTranslateY(220);
        uranus.setTranslateZ(700);
        root.getChildren().add(uranus);
                
        Sphere saturn = new Sphere(200);
        saturn.setTranslateX(-200);
        saturn.setTranslateY(150);
        saturn.setTranslateZ(600);
        root.getChildren().add(saturn);
        
        Sphere jupiter = new Sphere(300);
        jupiter.setTranslateX(-300);
        jupiter.setTranslateY(-250);
        jupiter.setTranslateZ(500);
        root.getChildren().add(jupiter);
        
        Sphere venus = new Sphere(80);
        venus.setTranslateX(-110);
        venus.setTranslateY(70);
        venus.setTranslateZ(400);
        root.getChildren().add(venus);
        
        Sphere mysphere = new Sphere(100);
        mysphere.setTranslateX(-180);
        mysphere.setTranslateY(-100);
        mysphere.setTranslateZ(500);
        root.getChildren().add(mysphere);   
              
        
        Sphere mars = new Sphere(85);
        mars.setTranslateX(50);
        mars.setTranslateY(-70);
        mars.setTranslateZ(300);
        root.getChildren().add(mars);
        
        Sphere mercury = new Sphere(50);
        mercury.setTranslateX(-100);
        mercury.setTranslateY(-50);
        mercury.setTranslateZ(100);
        root.getChildren().add(mercury);
        
        
        
        
        //This sets up the image of the earth to wrap around my sphere
        Image earthImage = new Image("file:earth.jpg");
        PhongMaterial earthPhong = new PhongMaterial();
        earthPhong.setDiffuseMap(earthImage);
        mysphere.setMaterial(earthPhong);
        
        Image mercuryImage = new Image("file:mercury.jpg");
        PhongMaterial mercuryPhong = new PhongMaterial();
        mercuryPhong.setDiffuseMap(mercuryImage);
        mercury.setMaterial(mercuryPhong);
        
        Image venusImage = new Image("file:venus.jpg");
        PhongMaterial venusPhong = new PhongMaterial();
        venusPhong.setDiffuseMap(venusImage);
        venus.setMaterial(venusPhong);
        
        Image marsImage = new Image("file:mars.jpg");
        PhongMaterial marsPhong = new PhongMaterial();
        marsPhong.setDiffuseMap(marsImage);
        mars.setMaterial(marsPhong);
        
        Image jupiterImage = new Image("file:jupiter.jpg");
        PhongMaterial jupiterPhong = new PhongMaterial();
        jupiterPhong.setDiffuseMap(jupiterImage);
        jupiter.setMaterial(jupiterPhong);
        
        Image saturnImage = new Image("file:saturn.jpg");
        PhongMaterial saturnPhong = new PhongMaterial();
        saturnPhong.setDiffuseMap(saturnImage);
        saturn.setMaterial(saturnPhong);
        
        Image uranusImage = new Image("file:uranus.png");
        PhongMaterial uranusPhong = new PhongMaterial();
        uranusPhong.setDiffuseMap(uranusImage);
        uranus.setMaterial(uranusPhong);
        
        Image neptuneImage = new Image("file:neptune.jpg");
        PhongMaterial neptunePhong = new PhongMaterial();
        neptunePhong.setDiffuseMap(neptuneImage);
        neptune.setMaterial(neptunePhong);
        
        //This rotates my sphere
        RotateTransition rotate = new RotateTransition();
        rotate.setNode(mysphere);
        rotate.setDuration(Duration.millis(5000));
        rotate.setAxis(Rotate.Y_AXIS);
        rotate.setByAngle(-360);
        rotate.setCycleCount(Animation.INDEFINITE);
        rotate.setInterpolator(Interpolator.LINEAR);
        rotate.play();
        
        RotateTransition rotatemr = new RotateTransition();
        rotatemr.setNode(mercury);
        rotatemr.setDuration(Duration.millis(3000));
        rotatemr.setAxis(Rotate.Y_AXIS);
        rotatemr.setByAngle(-360);
        rotatemr.setCycleCount(Animation.INDEFINITE);
        rotatemr.setInterpolator(Interpolator.LINEAR);
        rotatemr.play();
        
        RotateTransition rotateve = new RotateTransition();
        rotateve.setNode(venus);
        rotateve.setDuration(Duration.millis(4000));
        rotateve.setAxis(Rotate.Y_AXIS);
        rotateve.setByAngle(-360);
        rotateve.setCycleCount(Animation.INDEFINITE);
        rotateve.setInterpolator(Interpolator.LINEAR);
        rotateve.play();
        
        RotateTransition rotatema = new RotateTransition();
        rotatema.setNode(mars);
        rotatema.setDuration(Duration.millis(4500));
        rotatema.setAxis(Rotate.Y_AXIS);
        rotatema.setByAngle(-360);
        rotatema.setCycleCount(Animation.INDEFINITE);
        rotatema.setInterpolator(Interpolator.LINEAR);
        rotatema.play();
        
        RotateTransition rotateju = new RotateTransition();
        rotateju.setNode(jupiter);
        rotateju.setDuration(Duration.millis(20000));
        rotateju.setAxis(Rotate.Y_AXIS);
        rotateju.setByAngle(-360);
        rotateju.setCycleCount(Animation.INDEFINITE);
        rotateju.setInterpolator(Interpolator.LINEAR);
        rotateju.play();
        
        RotateTransition rotatesa = new RotateTransition();
        rotatesa.setNode(saturn);
        rotatesa.setDuration(Duration.millis(10000));
        rotatesa.setAxis(Rotate.Y_AXIS);
        rotatesa.setByAngle(-360);
        rotatesa.setCycleCount(Animation.INDEFINITE);
        rotatesa.setInterpolator(Interpolator.LINEAR);
        rotatesa.play();
        
        RotateTransition rotateur = new RotateTransition();
        rotateur.setNode(uranus);
        rotateur.setDuration(Duration.millis(7000));
        rotateur.setAxis(Rotate.Y_AXIS);
        rotateur.setByAngle(-360);
        rotateur.setCycleCount(Animation.INDEFINITE);
        rotateur.setInterpolator(Interpolator.LINEAR);
        rotateur.play();
        
        RotateTransition rotatene = new RotateTransition();
        rotatene.setNode(neptune);
        rotatene.setDuration(Duration.millis(6500));
        rotatene.setAxis(Rotate.Y_AXIS);
        rotatene.setByAngle(-360);
        rotatene.setCycleCount(Animation.INDEFINITE);
        rotatene.setInterpolator(Interpolator.LINEAR);
        rotatene.play();
        
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
