public class FakeExchange implements Exchange {
    @Override
    public float rate(String origin, String target) {
        return 0.85f; // Fixed rate for testing
    }
}
