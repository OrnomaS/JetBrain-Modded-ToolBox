package fr.OrnomaS.Flasher;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXProgressBar;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import java.io.File;
import java.io.IOException;

public class Controller
{

    private Boolean patch_mode = true;
    private Boolean install_mode = false;
    private Boolean donate_mode = false;

    @FXML
    public JFXButton OPEN_GITHUB_BTN;
    public AnchorPane root_donate;
    public ImageView OPEN_GITHUB_IMG;
    public ImageView DONATE_ENABLER_IMG;
    public JFXButton DONATE_ENABLER_BTN;
    public ImageView clion_install;
    public ImageView datagrip_install;
    public ImageView goland_install;
    public JFXProgressBar progressBar_install;
    public JFXButton webstorm_btn_install;
    public JFXButton ruby_btn_install;
    public JFXButton rider_btn_install;
    public JFXButton pycharm_btn_install;
    public JFXButton php_btn_install;
    public JFXButton idea_btn_install;
    public JFXButton goland_btn_install;
    public JFXButton datagrip_btn_install;
    public JFXButton clion_btn_install;
    public ImageView webstorm_img_install;
    public ImageView ruby_img_install;
    public ImageView rider_img_install;
    public ImageView pycharm_img_install;
    public ImageView php_img_install;
    public ImageView idea_img_install;
    public ImageView goland_img_install;
    public ImageView datagrip_img_install;
    public ImageView clion_img_install;
    public ImageView webstorm_install;
    public ImageView ruby_install;
    public ImageView idea_install;
    public ImageView rider_install;
    public ImageView php_install;
    public ImageView pycharm_install;
    public AnchorPane menu;
    public ImageView PATCH_ENABLER_IMG;
    public JFXButton PATCH_ENABLER_BTN;
    public ImageView INSTALL_ENABLER_IMG;
    public JFXButton INSTALL_ENABLER_BTN;
    public AnchorPane root_donate_fx;
    public AnchorPane root;
    public AnchorPane root_patch;
    public AnchorPane root_patch_fx;
    public AnchorPane root_install;
    public AnchorPane root_install_fx;
    public ImageView clion_light;
    public ImageView datagrip_light;
    public ImageView goland_light;
    public ImageView idea_light;
    public ImageView php_light;
    public ImageView pycharm_light;
    public ImageView rider_light;
    public ImageView ruby_light;
    public ImageView webstorm_light;
    public JFXButton clion_btn;
    public JFXButton datagrip_btn;
    public JFXButton goland_btn;
    public JFXButton idea_btn;
    public JFXButton php_btn;
    public JFXButton pycharm_btn;
    public JFXButton rider_btn;
    public JFXButton ruby_btn;
    public JFXButton webstorm_btn;
    public ImageView clion_img;
    public ImageView datagrip_img;
    public ImageView goland_img;
    public ImageView idea_img;
    public ImageView php_img;
    public ImageView pycharm_img;
    public ImageView rider_img;
    public ImageView ruby_img;
    public ImageView webstorm_img;
    public JFXProgressBar progressBar;

    private Thread t1;
    private Thread t;

    @FXML
    private void clionAction()
    {
        Main.bar.setProgress(0.0);
        Utils utils = new Utils();
        utils.downloadJar();
        utils.detector();
        if (utils.t.isAlive())
        {
            Runnable task = () -> {
                Runnable task1 = () -> {
                    try {
                        Thread.sleep(2000);
                        if (!utils.t.isAlive()) utils.patchIDE(new File(utils.clion), clion_light);
                        System.out.print("CLion has been patched");
                        t1.interrupt();
                    } catch (InterruptedException e) { e.printStackTrace(); }
                };
                t1 = new Thread(task1);
                t1.start();
                t.interrupt(); };
            t = new Thread(task);
            t.start();
        }
    }

    @FXML
    private void datagriptAction()
    {
        Main.bar.setProgress(0.0);
        Utils utils = new Utils();
        utils.downloadJar();
        utils.detector();
        if (utils.t.isAlive())
        {
            Runnable task = () -> {
                Runnable task1 = () -> {
                    try {
                        Thread.sleep(2000);
                        if (!utils.t.isAlive()) utils.patchIDE(new File(utils.dataGrip), datagrip_light);
                        System.out.print("DataGrip has been patched");
                        t1.interrupt();
                    } catch (InterruptedException e) { e.printStackTrace(); }
                };
                t1 = new Thread(task1);
                t1.start();
                t.interrupt(); };
            t = new Thread(task);
            t.start();
        }
    }

    @FXML
    private void golandAction()
    {
        Main.bar.setProgress(0.0);
        Utils utils = new Utils();
        utils.downloadJar();
        utils.detector();
        if (utils.t.isAlive())
        {
            Runnable task = () -> {
                Runnable task1 = () -> {
                    try {
                        Thread.sleep(3000);
                        if (!utils.t.isAlive()) utils.patchIDE(new File(utils.goLand), goland_light);
                        System.out.print("GoLand has been patched");
                        t1.interrupt();
                    } catch (InterruptedException e) { e.printStackTrace(); }
                };
                t1 = new Thread(task1);
                t1.start();
                t.interrupt(); };
            t = new Thread(task);
            t.start();
        }
    }

    @FXML
    private void ideaAction()
    {
        Main.bar.setProgress(0.0);
        Utils utils = new Utils();
        utils.downloadJar();
        utils.detector();
        if (utils.t.isAlive())
        {
            Runnable task = () -> {
                Runnable task1 = () -> {
                    try {
                        Thread.sleep(3000);
                        if (!utils.t.isAlive()) utils.patchIDE(new File(utils.idea), idea_light);
                        t1.interrupt();
                    } catch (InterruptedException e) { e.printStackTrace(); }
                };
                t1 = new Thread(task1);
                t1.start();
                t.interrupt(); };
            t = new Thread(task);
            t.start();
        }
    }

    @FXML
    private void phpAction()
    {
        Main.bar.setProgress(0.0);
        Utils utils = new Utils();
        utils.downloadJar();
        utils.detector();
        if (utils.t.isAlive())
        {
            Runnable task = () -> {
                Runnable task1 = () -> {
                    try {
                        Thread.sleep(3000);
                        if (!utils.t.isAlive()) utils.patchIDE(new File(utils.phpStorm), php_light);
                        System.out.print("PHPStorm has been patched");
                        t1.interrupt();
                    } catch (InterruptedException e) { e.printStackTrace(); }
                };
                t1 = new Thread(task1);
                t1.start();
                t.interrupt(); };
            t = new Thread(task);
            t.start();
        }
    }

    @FXML
    private void pycharmAction()
    {
        Main.bar.setProgress(0.0);
        Utils utils = new Utils();
        utils.downloadJar();
        utils.detector();
        if (utils.t.isAlive())
        {
            Runnable task = () -> {
                Runnable task1 = () -> {
                    try {
                        Thread.sleep(3000);
                        if (!utils.t.isAlive()) utils.patchIDE(new File(utils.pycharm), pycharm_light);
                        System.out.print("PyCharm has been patched");
                        t1.interrupt();
                    } catch (InterruptedException e) { e.printStackTrace(); }
                };
                t1 = new Thread(task1);
                t1.start();
                t.interrupt(); };
            t = new Thread(task);
            t.start();
        }
    }

    @FXML
    private void riderAction()
    {
        Main.bar.setProgress(0.0);
        Utils utils = new Utils();
        utils.downloadJar();
        utils.detector();
        if (utils.t.isAlive())
        {
            Runnable task = () -> {
                Runnable task1 = () -> {
                    try {
                        Thread.sleep(3000);
                        if (!utils.t.isAlive()) utils.patchIDE(new File(utils.rider), rider_light);
                        System.out.print("Rider has been patched");
                        t1.interrupt();
                    } catch (InterruptedException e) { e.printStackTrace(); }
                };
                t1 = new Thread(task1);
                t1.start();
                t.interrupt(); };
            t = new Thread(task);
            t.start();
        }
    }

    @FXML
    private void rubyAction()
    {
        Main.bar.setProgress(0.0);
        Utils utils = new Utils();
        utils.downloadJar();
        utils.detector();
        if (utils.t.isAlive())
        {
            Runnable task = () -> {
                Runnable task1 = () -> {
                    try {
                        Thread.sleep(3000);
                        if (!utils.t.isAlive()) utils.patchIDE(new File(utils.rubyMine), ruby_light);
                        System.out.print("RubyMine has been patched");
                        t1.interrupt();
                    } catch (InterruptedException e) { e.printStackTrace(); }
                };
                t1 = new Thread(task1);
                t1.start();
                t.interrupt(); };
            t = new Thread(task);
            t.start();
        }
    }

    @FXML
    private void webstormAction()
    {
        Main.bar.setProgress(0.0);
        Utils utils = new Utils();
        utils.downloadJar();
        utils.detector();
        if (utils.t.isAlive())
        {
            Runnable task = () -> {
                Runnable task1 = () -> {
                    try {
                        Thread.sleep(3000);
                        if (!utils.t.isAlive()) utils.patchIDE(new File(utils.webStorm), webstorm_light);
                        System.out.print("WebStorm has been patched");
                        t1.interrupt();
                    } catch (InterruptedException e) { e.printStackTrace(); }
                };
                t1 = new Thread(task1);
                t1.start();
                t.interrupt(); };
            t = new Thread(task);
            t.start();
        }
    }

    @FXML
    private void exit()
    {
        Main.exitFlasher();
    }

    @FXML
    private void EnablePatchMode()
    {
        if (install_mode.equals(true))
        {
            root_install.toBack();
            root_install_fx.setLayoutY(43.0);
            install_mode = false;
        }
        else if (donate_mode.equals(true))
        {
            root_donate.toBack();
            root_donate_fx.setLayoutY(43.0);
            donate_mode = false;
        }
        root_patch.toFront();
        root_patch_fx.setLayoutY(40.0);
        patch_mode = true;

    }

    @FXML
    private void EnableInstallMode()
    {
        if (patch_mode.equals(true))
        {
            root_patch.toBack();
            root_patch_fx.setLayoutY(43.0);
            patch_mode = false;
        }
        else if (donate_mode.equals(true))
        {
            root_donate.toBack();
            root_donate_fx.setLayoutY(43.0);
            donate_mode = false;
        }
        root_install.toFront();
        root_install_fx.setLayoutY(40.0);
        install_mode = true;
    }

    @FXML
    private void EnableDonateMode()
    {
        if (patch_mode.equals(true))
        {
            root_patch.toBack();
            root_patch_fx.setLayoutY(43.0);
            patch_mode = false;
        }
        else if (install_mode.equals(true))
        {
            root_install.toBack();
            root_install_fx.setLayoutY(43.0);
            install_mode = false;
        }
        root_donate.toFront();
        root_donate_fx.setLayoutY(40.0);
        donate_mode = true;
    }

    @FXML
    private void OpenGithub()
    {
        Runnable task = () -> {
            Runtime rt = Runtime.getRuntime();
            String url = "https://github.com/OrnomaS/JetBrain-Modded-ToolBox";
            try {
                rt.exec("rundll32 url.dll,FileProtocolHandler " + url);
            } catch (IOException e) {
                e.printStackTrace();
            }
        };
        Thread thread = new Thread(task);
        thread.start();
    }

    @FXML
    private void clionInstall()
    {   Main.progressBar_install.setProgress(0.0);
        Utils utils = new Utils();
        utils.downloadSetup("https://download.jetbrains.com/cpp/CLion-2018.2.4.exe", "CLion-2018.2.4.exe", clion_install);
    }

    @FXML
    private void datagriptInstall()
    {
        Main.progressBar_install.setProgress(0.0);
        Utils utils = new Utils();
        utils.downloadSetup("https://download.jetbrains.com/datagrip/datagrip-2018.2.4.exe", "datagrip-2018.2.4.exe", datagrip_install);
    }

    @FXML
    private void golandInstall()
    {
        Main.progressBar_install.setProgress(0.0);
        Utils utils = new Utils();
        utils.downloadSetup("https://download.jetbrains.com/go/goland-2018.2.3.exe", "goland-2018.2.3.exe", goland_install);
    }

    @FXML
    private void ideaInstall()
    {
        Main.progressBar_install.setProgress(0.0);
        Utils utils = new Utils();
        utils.downloadSetup("https://download.jetbrains.com/idea/ideaIU-2018.2.4.exe", "ideaIU-2018.2.4.exe", idea_install);
    }

    @FXML
    private void phpInstall()
    {
        Main.progressBar_install.setProgress(0.0);
        Utils utils = new Utils();
        utils.downloadSetup("https://download.jetbrains.com/webide/PhpStorm-2018.2.4.exe", "PhpStorm-2018.2.4.exe", php_install);
    }

    @FXML
    private void pycharmInstall()
    {
        Main.progressBar_install.setProgress(0.0);
        Utils utils = new Utils();
        utils.downloadSetup("https://download.jetbrains.com/python/pycharm-professional-2018.2.4.exe", "pycharm-professional-2018.2.4.exe", pycharm_install);
    }

    @FXML
    private void riderInstall()
    {
        Main.progressBar_install.setProgress(0.0);
        Utils utils = new Utils();
        utils.downloadSetup("https://download.jetbrains.com/rider/JetBrains.Rider-2018.2.3.exe", "JetBrains.Rider-2018.2.3.exe", rider_install);
    }

    @FXML
    private void rubyInstall()
    {
        Main.progressBar_install.setProgress(0.0);
        Utils utils = new Utils();
        utils.downloadSetup("https://download.jetbrains.com/ruby/RubyMine-2018.2.3.exe", "RubyMine-2018.2.3.exe", ruby_install);
    }

    @FXML
    private void webstormInstall()
    {
        Main.progressBar_install.setProgress(0.0);
        Utils utils = new Utils();
        utils.downloadSetup("https://download.jetbrains.com/webstorm/WebStorm-2018.2.4.exe", "WebStorm-2018.2.4.exe", webstorm_install);
    }
}
