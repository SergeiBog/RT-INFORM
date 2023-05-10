static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>()
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

static HashMap<Integer, Integer> countElements(ArrayList<Integer> list) {
    HashMap<Integer, Integer> result = new HashMap<>();
    for (x in list) {
        if (!result.containsKey(x)) {
            result.put(x, 1)
        } else {
            result.put(x, result.get(x) + 1)
        }
    }
    return result
}