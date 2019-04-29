public class ReportCommand extends Command {

    public String execute() {
        WDIDAO dao = WDIDAO.getDAO();
        return dao.report(command[1]);
    }
}
