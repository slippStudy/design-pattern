package mediator;

import java.util.ArrayList;
import java.util.List;

public class ApplicationMediator implements Mediator {
    private List<Colleague> colleagues;

    public ApplicationMediator() {
        colleagues = new ArrayList<>();
    }

    public void addColleague(Colleague colleague) {
        this.colleagues.add(colleague);
    }

    public void send(String message, Colleague colleague) {
        for (Colleague c : colleagues) {
            if (colleague != c) {
                colleague.receive(message);
            }
        }
    }
}
