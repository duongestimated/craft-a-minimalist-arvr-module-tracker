import java.util.ArrayList;
import java.util.List;

public class y8cd_craft_a_minimal {

    // Module class to store module information
    static class Module {
        String name;
        int progress;

        public Module(String name, int progress) {
            this.name = name;
            this.progress = progress;
        }
    }

    // Tracker class to manage modules
    static class Tracker {
        List<Module> modules;

        public Tracker() {
            this.modules = new ArrayList<>();
        }

        public void addModule(Module module) {
            modules.add(module);
        }

        public void updateProgress(String moduleName, int progress) {
            for (Module module : modules) {
                if (module.name.equals(moduleName)) {
                    module.progress = progress;
                    break;
                }
            }
        }

        public void displayModules() {
            for (Module module : modules) {
                System.out.println("Module: " + module.name + ", Progress: " + module.progress + "%");
            }
        }
    }

    public static void main(String[] args) {
        Tracker tracker = new Tracker();

        // Sample modules
        Module module1 = new Module("Crafting 101", 50);
        Module module2 = new Module("Survival Skills", 20);
        Module module3 = new Module("Building Basics", 80);

        tracker.addModule(module1);
        tracker.addModule(module2);
        tracker.addModule(module3);

        tracker.displayModules();

        tracker.updateProgress("Survival Skills", 40);
        tracker.displayModules();
    }
}