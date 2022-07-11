package iducs.java.pim201812045;

import iducs.java.pim201812045.controller.MemberController;

public class Main {

    public static void main(String[] args) {
        MemberController memberController = new MemberController();
        memberController.dispatch();
    }
}
