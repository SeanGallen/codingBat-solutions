stringTimes
public String stringTimes(String str, int n) {
  String result = "";
  for (int i =0; i < n; i++) {

    result = result + str;
  }
  return result;
}

doubleX
boolean doubleX(String str) {
  int a = str.indexOf('x');
  int b = str.indexOf("xx");
  return  (a == b && b != -1);

}

last2
public int last2(String str) {
  int count= 0;

  for(int i=0; i < str.length()-2; i++) {
    String last2 = str.substring(str.length()-2, str.length());
    if (str.substring(i, i+2).equals(last2)) {

      count++;
    }
  }
  return count;

}

array123
public boolean array123(int[] nums) {

  for ( int i = 0; i < nums.length-2; i++) {
    if (nums[i]== 1 && nums[i+1]== 2 && nums[i+2]== 3) {
      return true;
    }
  }
  return false;
}

altParis
public String altPairs(String str) {
  String result = "";

  for(int i= 0; i < str.length(); i+=4) {
    int last = i +2;
    if (last > str.length()) {
      last = str.length();
    }

    result = result + str.substring(i, last);
  }
  return result;
  alt
}

noTriples
public boolean noTriples(int[] nums) {
  for (int i = 0; i < nums.length -2; i++) {
    if((nums[i] == nums[i + 1]) &&(nums[i] == nums[i +2])) {
      return false;
    }
  }
  return true;
}

frontTimes
public String frontTimes(String str, int n) {
  String result = "";
  for(int i = 0; i < n; i++) {
    if (str.length() <=3) {
      result = result + str;
    }else{
      result = result + str.substring(0,3);
    }
  }
  return result;
}

stringBits
public String stringBits(String str) {
  String result = "";

  for(int i = 0; i < str.length(); i++) {

    if (i % 2 == 0) {
      result = result + str.charAt(i);
    }
  }
  return result;
}

arrayCount9
public int arrayCount9(int[] nums) {
  int count = 0;
  for(int i = 0; i < nums.length; i++) {
    if (nums[i] == 9){
      count++;
    }

  }
  return count;
}

stringMatch
public int stringMatch(String a, String b) {

  int len = Math.min(a.length(), b.length());
  int count = 0;

  for (int i=0; i<len-1; i++) {
    String aSub = a.substring(i, i+2);
    String bSub = b.substring(i, i+2);
    if (aSub.equals(bSub)) {
      count++;
    }
  }

  return count;
}

stringYak
public String stringYak(String str) {
  String result = "";
  for (int i=0; i<str.length(); i++) {
    if (i+2<str.length() && str.charAt(i)=='y' && str.charAt(i+2)=='k') {
      i =  i + 2;
    } else {
      result = result + str.charAt(i);
    }
  }
  return result;
}

has271
public boolean has271(int[] nums) {
  return true if a n is followed by n +5 and than (n -1 or n -2)
    for (int i = 0; i < nums.length-2; i++) {
      int n = nums[i];
      if(nums[i] == n && nums[i+1] == n +5 && ((nums[i+2] == n-1) || (nums[i+2] == n-2)|| (nums[i+2] == n + 1)||(nums[i+2] == n-3))) return true;

    }
  return false;
}

countXX
int countXX(String str) {
  int count = 0;
  for (int i=0; i < str.length()-1; i++) {
    if(str.substring(i, i+2).equals("xx")) count++;
  }
  return count;
}

stringSplosion
public String stringSplosion(String str) {
  String result = "";
  for(int i = 0; i<str.length()-1; i++) {
    result = str.substring(0,i) + str.substring(0,i+1) +  str.substring(0,i+2);
  }
  return result;
}

arrayFront9
public boolean arrayFront9(int[] nums) {
  if (nums.length == 1 && nums[0] == 9) { return true;};
  if (nums.length == 2 && nums[1] == 9) { return true;};
  for(int i = 0; i< nums.length-1;  i++) {

    if (nums.length <= 5 && nums[i] == 9){
      return true;
    }
  }
  return false;
}

stringX

public String stringX(String str) {
  String result = "";
  for (int i=0; i<str.length(); i++) {
    if (!(i > 0 && i < (str.length()-1) && str.substring(i, i+1).equals("x"))) {
      result = result + str.substring(i, i+1);

    }
  }
  return result;
}

array667
public int array667(int[] nums) {
  int count = 0;
  for (int i =0; i <nums.length-1; i++) {
    if(nums[i]== 6 && (nums[i+1] == 6 || nums[i+1] == 7))
      count++;
  }
  return count;
}
