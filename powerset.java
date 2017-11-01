    public static List<String> generatePowerSet(String[] values) {
        List<String> result = new ArrayList<>();

        recurse(values, result);

        return result;
    }

    private static void recurse(String[] values, List<String> progress) {
        for (int i = 0; i < values.length; i++) {
            recurse(values, progress, i + 1, values[i]);
        }
    }

    private static void recurse(String[] values, List<String> progress, int c, String current) {
        for (int i = c; i < values.length; i++) {
            progress.add(current + values[i]);
            recurse(values, progress, i + 1, current + values[i]);
        }
    }
