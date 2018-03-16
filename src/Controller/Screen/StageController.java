/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Screen;

import java.util.HashMap;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author user
 */
public class StageController {

    private static final HashMap<String, Scene> SCREEN_MAP = new HashMap<>();
    private static Stage stage;

    public static void setStage(Stage stage) {
        StageController.stage = stage;
    }

    public static void addScreen(String name, Scene scene) {
        SCREEN_MAP.put(name, scene);
    }

    public static void removeScreen(String name) {
        SCREEN_MAP.remove(name);
    }

    public static void activate(String name) {
        stage.setScene(SCREEN_MAP.get(name));
    }
}
