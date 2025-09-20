class NullDemo {
    static void showError() {
        String s = null;
        System.out.println(s.length()); // exception
    }

    static void handleError() {
        String s = null;
        try {
            System.out.println(s.length());
        } catch (NullPointerException e) {
            System.out.println("Handled: " + e);
        }
    }

    public static void main(String[] args) {
        // without handling
        try {
            showError();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        // with handling
        handleError();
    }
}
