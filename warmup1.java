sleepIn
public boolean sleepIn(boolean weekday, boolean vacation) {
  if (vacation == true)  {
    return true;
  } else if (weekday == true) {
    return false;
  } else {
    return true;
  }
}

diff21
public int diff21(int n) {
  if (n > 21) {
    int r = n - 21;
    return r * 2;
  } else if (n < 21) {
    int d = 21 - n;
    return d;
  } else{
    return 0;
  }
}

nearHundred
public boolean nearHundred(int n) {
  if ( ((90 <= n ) && ( n <= 110)) || ((190 <= n ) && ( n <= 210))) {
    return true;
  } else {
    return false;
  }
}

missingChar
public String missingChar(String str, int n) {
  if (n == 0) {
    return str.substring(1, str.length());
  } else{
    return str.substring(0, n) + str.substring(n + 1, str.length());
  }
}

backAround
public String backAround(String str) {
  return str.substring(str.length() -1) + str + str.substring(str.length()-1) ;
}

startHi
public boolean startHi(String str) {
  if (str.length() < 2) {
    return false;
  } else if (str.substring(0, 2).equals("hi")) {
    return true;
  } else {
    return false;
  }
}

hasTeen
public boolean hasTeen(int a, int b, int c) {
  return (a >= 13 && a <= 19 || b >= 13 && b <= 19 || c >= 13 && c <= 19);
}

mixStart
public boolean mixStart(String str) {
  return (str.length() >2 && str.substring(1,3).equals("ix"));

}

close10
public int close10(int a, int b) {
  if (Math.abs(a - 10) == Math.abs(b - 10)) {
    return 0;
  } else if (Math.abs(a - 10) < Math.abs(b - 10)){
    return a;
  } else {
    return b;
  }
}

stringE
public boolean stringE(String str) {
    int count = 0;
      char current;
        for (int i = 0; i < str.length(); i++) {
              current = str.charAt(i);
                  if (current == 'e') {
                          count++;
                              }
                    }
          return (count >= 1 && count <= 3);
}

everyNth
public String everyNth(String str, int n) {
    String result = "";
          for (int i = 0; i < str.length(); i ++) {
                    if (i % n == 0) {
                                 result = result + str.charAt(i);
                                        }

                          }
                  return result;
}

monkeyTrouble
public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
  return !(aSmile || bSmile) || (aSmile && bSmile);
}

parrotTrouble
public boolean parrotTrouble(boolean talking, int hour) {
  if ((talking == true && hour < 7) || (talking == true && hour > 20)) {
    return true;
  } else {
    return false;

  }
}

posNeg
public boolean posNeg(int a, int b, boolean negative) {
  if (negative == true && a < 0 && b < 0) {
    return true;
  } else if (negative == false && (a < 0 && b < 0)) {
    return false;
  } else if (negative == false && ((a <0 && b > 0) || (a > 0 && b < 0))) {
    return true;
  } else {
    return false;
  }
}

frontBack
public String frontBack(String str) {

  if (str.length() <= 1) {
    return str;
  } else {
    String first_letter = str.substring(0, 1);
    String last_letter = str.substring(str.length()-1);
    return last_letter + str.substring(1,str.length()-1) +
      first_letter;

  }
}

or35
public boolean or35(int n) {
  return ((n % 3 == 0) || (n % 5 == 0));

}

icyHot
public boolean icyHot(int temp1, int temp2) {
  if ((temp1 < 0 && temp2 > 100)||(temp1 > 100 && temp2 < 0) ) {
    return true;
  } else {
    return false;
  }
}

loneTeen
public boolean loneTeen(int a, int b) {
  if ((a >= 13 && a <= 19) && (b >= 13 && b <= 19)) {
    return false;
  } else if ((b >= 13 && b <= 19)||(a >= 13 && a <= 19)){
    return true;
  } else {
    return false;
  }
}

startOz
public String startOz(String str) {
  if (str.length() <= 2) {
    return str;
  } else if (str.substring(0,2).equals("oz")) {
    return "oz";
  } else if (str.substring(0,1).equals("o")){
    return "o";
  } else if (str.substring(1,2).equals("z")) {
    return "z";
  }
  return "";

}

in3050
public boolean in3050(int a, int b) {
  return (( a >= 30 && a <= 40) && (b >= 30 && b <= 40)||( a >= 40 && a <= 50) && (b >= 40 && b <= 50));
}

lastDigit
public boolean lastDigit(int a, int b) {
  return ((a-b) % 10 == 0);
}

sumDouble
public int sumDouble(int a, int b) {
  if (a == b) {
    return ((a * 2) + (b * 2));
  } else {
    return(a + b);
  }
}

makes10
public boolean makes10(int a, int b) {
  if ( (( a == 10) || (b == 10)) || (a + b == 10)) {
    return true;
  } else {
    return false;
  }
}

notString
public String notString(String str) {
  if ((str.length()< 3) || !(str.substring(0,3).equals("not"))) {

    return "not " + str;
  }
  return str;
}

front3
public String front3(String str) {
  if (str.length() == 0) {
    return "";
  } else {
    int n = Math.min(3, str.length());
    return str.substring(0, (n)) + str.substring(0, (n)) + str.substring(0,(n));
  }
}

front22
public String front22(String str) {
  if (str.length() <= 2) {
    return str + str + str;
  } else {
    return (str.substring(0,2) + str + str.substring(0,2));
  }
}

in1020
public boolean in1020(int a, int b) {
  return (a >= 10 && a <= 20 || b >= 10 && b <= 20);
}

delDel
public String delDel(String str) {
  if (str.length() > 3 && str.substring(1,4).equals("del")){
    return str.charAt(0) + str.substring(4, str.length());
  } else {
    return str;
  }
}

intMax
public int intMax(int a, int b, int c) {
  if ( a > b && a > c) {
    return a;
  } else if ( b > a && b > c) {
    return b;
  }
  return c;
}

max1020
public int max1020(int a, int b) {
  if (( a >= 10 && a <= 20) && ( b >= 10 && b <= 20 )) {
    return Math.max(a, b);
  } else if (( a >= 10 && a <= 20) && !( b >= 10 && b <= 20 )) {
    return a;
  } else if (!( a >= 10 && a <= 20) && ( b >= 10 && b <= 20 )) {
    return b;
  }
  return 0;
}

endUp
public String endUp(String str) {
  if ( str.length() <= 3) {
    return str.toUpperCase();
  } else {
    return str.replaceAll(str.substring(str.length() - 3), str.substring(str.length() - 3).toUpperCase());
  }
}


