static void main(String[] args) {
    List<Integer> list = new ArrayList<>()
    Scanner sc = new Scanner(System.in)
    while (!sc.hasNext("count")) {
        list.add(sc.nextInt())
    }
    sc.close()
    def result = countElements(list)
    for (x in result.keySet()) {
        println(x + " : " + result.get(x))
    }
}

static Map<Integer, Integer> countElements(List<Integer> list) {
    Map<Integer, Integer> result = new HashMap<>()
    for (x in list) {
        if (!result.containsKey(x)) {
            result.put(x, 1)
        } else {
            result.put(x, result.get(x) + 1)
        }
    }
    return result
}