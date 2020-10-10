int nu01 = 10000;
int level = 0;
int increase = 35000;

for (int i = 0; i < 100; i++) {
    nu01 = nu01 + increase;
    level++;
    System.out.println(nu01);

    if (level > 50) {
        increase = 45000;
    }
