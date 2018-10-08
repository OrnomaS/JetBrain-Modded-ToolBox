package fr.OrnomaS.Flasher;

import javafx.scene.image.ImageView;
import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.Objects;

class Utils
{
    String idea;
    String pycharm;
    String clion;
    String webStorm;
    String goLand;
    String phpStorm;
    String rubyMine;
    String dataGrip;
    String rider;
    Thread t;

    void downloadSetup(String str_url, String setup_name, ImageView ide_install)
    {
        if (!new File(System.getProperty("user.home") + "\\" + setup_name).exists()) {
            Runnable task = () -> {
                try {
                    int count;
                    URL url = new URL(str_url);
                    URLConnection urlConnection = url.openConnection();
                    urlConnection.connect();
                    InputStream inputStream = new BufferedInputStream(url.openStream());
                    OutputStream outputStream = new FileOutputStream(System.getProperty("user.home") + "\\" + setup_name);
                    byte[] data = new byte[1024];
                    long total = 0;
                    while ((count = inputStream.read(data)) != -1) {
                        total += count;
                        double progress = (double) total / urlConnection.getContentLength();
                        Main.progressBar_install.setProgress(progress);
                        System.out.print("progress ");
                        outputStream.write(data, 0, count);
                    }
                    inputStream.close();
                    outputStream.close();
                    File setup = new File(System.getProperty("user.home") + "\\" + setup_name);
                    Runtime runtime = Runtime.getRuntime();
                    runtime.exec(setup.getPath());
                    ide_install.setOpacity(1.0);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            };
            t = new Thread(task);
            t.start();
        }
        else {
            try {
                Main.progressBar_install.setProgress(1.0);
                Runtime runtime = Runtime.getRuntime();
                runtime.exec(System.getProperty("user.home") + "\\" + setup_name);
                ide_install.setOpacity(1.0);
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }

    void downloadJar(){
        Runnable task = () -> {
            try {
                int count;
                URL url = new URL("https://www.rover12421.com/jb/JetbrainsCrack-3.1-release-enc.jar");
                URLConnection urlConnection = url.openConnection();
                urlConnection.connect();
                InputStream input = new BufferedInputStream(url.openStream());
                OutputStream output = new FileOutputStream(System.getProperty("user.home") + "\\JetbrainsCrack-3.1-release-enc.jar");
                byte[] data = new byte[1024];
                long total = 0;
                while ((count = input.read(data)) != -1) {
                    total += count;
                    double progress = (double) total / urlConnection.getContentLength();
                    Main.bar.setProgress(progress);
                    System.out.print("progress ");
                    output.write(data, 0, count);
                }
                input.close();
                output.close();
            } catch (IOException e){
                e.printStackTrace();
            }
        };
        Thread t = new Thread(task);
        t.start();
        if (t.isAlive()) t.interrupt();
    }

    void detector(){
        Runnable task = () -> {
            File folder = new File("C:\\Program Files\\JetBrains\\");
            File[] listOfFiles = folder.listFiles();

            assert listOfFiles != null;
            for (File listOfFile : listOfFiles) {
                if (listOfFile.isFile()) {
                    System.out.println("File " + listOfFile.getName());
                } else if (listOfFile.isDirectory()) {
                    System.out.println("Directory " + listOfFile.getName());
                    File folder_in = new File(listOfFile.getPath());
                    listFileOfFolder(folder_in);
                }
            }
        };
        t = new Thread(task);
        t.start();
        t.interrupt();
    }

    private void listFileOfFolder(File folder){
        for (File fileEntry : Objects.requireNonNull(folder.listFiles())) {
            if (fileEntry.isDirectory()) {
                this.listFileOfFolder(fileEntry);
                continue;
            }
            switch (fileEntry.getName()) {
                case "idea64.exe.vmoptions": {
                    this.idea = fileEntry.getPath();
                    System.out.println("This file was found : " + fileEntry.getName() + ", the path is : " + this.idea + "\n");
                    break;
                }
                case "pycharm64.exe.vmoptions": {
                    this.pycharm = fileEntry.getPath();
                    System.out.println("This file was found : " + fileEntry.getName() + ", the path is : " + this.pycharm + "\n");
                    break;
                }
                case "clion64.exe.vmoptions": {
                    this.clion = fileEntry.getPath();
                    System.out.println("This file was found : " + fileEntry.getName() + ", the path is : " + this.clion + "\n");
                    break;
                }
                case "webstorm64.exe.vmoptions": {
                    this.webStorm = fileEntry.getPath();
                    System.out.println("This file was found : " + fileEntry.getName() + ", the path is : " + this.webStorm + "\n");
                    break;
                }
                case "goland64.exe.vmoptions": {
                    this.goLand = fileEntry.getPath();
                    System.out.println("This file was found : " + fileEntry.getName() + ", the path is : " + this.goLand + "\n");
                    break;
                }
                case "phpstorm64.exe.vmoptions": {
                    this.phpStorm = fileEntry.getPath();
                    System.out.println("This file was found : " + fileEntry.getName() + ", the path is : " + this.phpStorm + "\n");
                    break;
                }
                case "rubymine64.exe.vmoptions": {
                    this.rubyMine = fileEntry.getPath();
                    System.out.println("This file was found : " + fileEntry.getName() + ", the path is : " + this.rubyMine + "\n");
                    break;
                }
                case "datagrip64.exe.vmoptions": {
                    this.dataGrip = fileEntry.getPath();
                    System.out.print("This file was found : " + fileEntry.getName() + ", the path is : " + this.dataGrip + "\n");
                    break;
                }
                case "rider64.exe.vmoptions": {
                    this.rider = fileEntry.getPath();
                    System.out.print("This file was found : " + fileEntry.getName() + ", the path is : " + this.rider + "\n");
                    break;
                }
            }
        }
    }

    private Thread t1;
    private boolean result;
    void patchIDE(File file, ImageView light){
        Runnable task = () -> {
            try {
                FileWriter fw = new FileWriter(file);
                fw.write("-Xss2m\n" +
                        "-Xms256m\n" +
                        "-Xmx2000m\n" +
                        "-XX:NewSize=128m\n" +
                        "-XX:MaxNewSize=128m\n" +
                        "-XX:ReservedCodeCacheSize=240m\n" +
                        "-XX:+UseConcMarkSweepGC\n" +
                        "-XX:SoftRefLRUPolicyMSPerMB=50\n" +
                        "-ea\n" +
                        "-Dsun.io.useCanonCaches=false\n" +
                        "-Djava.net.preferIPv4Stack=true\n" +
                        "-XX:+HeapDumpOnOutOfMemoryError\n" +
                        "-XX:-OmitStackTraceInFastThrow\n" +
                        "-javaagent:" + System.getProperty("user.home") + "\\JetbrainsCrack-3.1-release-enc.jar");
                fw.close();
                result = true;
            } catch (IOException e){
                result = false;
                t1.interrupt();
                e.printStackTrace();
            }
            if (result){
                light.setOpacity(1.0);
            }
            if (t1.isAlive()){
                t1.interrupt();
                System.out.print("\nshutdown\n");
            }
        };
        t1 = new Thread(task);
        if (!t.isAlive())
        {
            t1.start();
        }
    }
}
