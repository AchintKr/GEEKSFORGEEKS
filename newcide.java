class employee {
    int id;

    employee(int id) {
        this.id = id;
    }
}

class check {

    void swap(employee e1, employee e2) {
        employee temp;
        temp = e1;
        e1 = e2;
        e2 = temp;
    }

}

class newcide {
    public static void main(String[] args) {
        employee e1 = new employee(10);
        employee e2 = new employee(20);
        check obj = new check();
        System.out.println(e1.id + " + " + e2.id);
        obj.swap(e1, e2);
        System.out.println(e1.id + " + " + e2.id);
    }
}
