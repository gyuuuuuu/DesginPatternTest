package responsibilityChain;

abstract class Handler {

    private Handler next;

    public void setNext(Handler next) {
        this.next = next;
    }

    final Response handleRequest(Request request) {
        if(request.getRequestLevel().equals(getHandlerLevel())) {
            return doSomething();
        } else {
            if (next != null) {
                return next.handleRequest(request);
            } else {
                return null;
            }

        }
    }

    abstract Level getHandlerLevel();
    abstract Response doSomething();

}
