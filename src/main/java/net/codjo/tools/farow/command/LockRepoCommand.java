package net.codjo.tools.farow.command;

public class LockRepoCommand extends Command {
    public LockRepoCommand() {
        super("Lecture seule du repo maven");
    }


    @Override
    public void execute(Display display) throws Exception {
        executeIt(display, "Z:\\maven\\bin\\lock-maven-repo.bat");
    }
}




