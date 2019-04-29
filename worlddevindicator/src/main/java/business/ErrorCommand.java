public class ErrorCommand extends Command {

    public String execute() {
        return "Unknown command: " + command[0];
    }
}
