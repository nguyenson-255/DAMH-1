package Main;

import Controller.ActionMenu;
import View.ViewMenu;

public class Main {

    public static void main(String[] args) {
        ViewMenu v = new ViewMenu();
        ActionMenu am =  new ActionMenu(v);
    }
}
