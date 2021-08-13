	//primitive types
        byte age = 30;
        int carPrice = 165_864_329;
        long membersNumber = 3_2563_524_635L;
        double secCarPrice = 3_165_864_329D;
        double height = 1.73;
        float weight = 70.66F;
        char letter = 'A';
        boolean isHungry = false;

        //Reference types
        Date date = new Date();
        date.getTime(); // this is return the time component of the object
        System.out.println(date);// we don't surround the date variable with double quotes
                                 // because it's not a string we need the value of the variable
	    System.out.println("Hello World"); // this will print a string

        byte x = 1;
        byte y = x;
        x = 2;
        System.out.println(y); // y will NOT be affected because x and y are independent of each other

        Point point1 = new Point(1,1);
        Point point2 = point1; // coping the value of point1 into point2,
                               // so as we say it's the address or the reference to the point1
        System.out.println("Before changes: " + point2);
        point1.x = 2; // x and y are field in that class
        System.out.println("After changes: " + point2);

        //Strings

        String text= "Hello World" + "!!";
        System.out.println(text.endsWith("!!"));// returns true/false we can check what characters end in the text.
        System.out.println(text.startsWith("Jf"));// returns true/false we can check what characters start in the text.
        System.out.println(text.length());
        System.out.println(text.indexOf("o")); // 4
        System.out.println(text.indexOf("root")); // we'll get -1
        System.out.println(text.replace('H','W'));