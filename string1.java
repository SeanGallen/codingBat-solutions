helloName
public String helloName(String name) {
  return "Hello " + name + "!";
}

makeOutWord
public String makeOutWord(String out, String word) {
  return out.substring(0,2) + word + out.substring(2,4);
}

firstHalf
public String firstHalf(String str) {
  return str.substring(0,((str.length())/2));
}

nonStart
public String nonStart(String a, String b) {
  return a.substring(1) + b.substring(1);
}

theEnd
public String theEnd(String str, boolean front) {
  if (front == true) {
    return str.substring(0,1);
  }
  return str.substring(str.length()-1 , str.length());

}

endsLy
public boolean endsLy(String str) {
  if (str.length() <2) {
    return false;
  }
  return (str.substring(str.length()-2, str.length()).equals("ly"));
}

middleThree
public String middleThree(String str) {
  int num = (str.length()/2);
  return (str.substring(num-1, num+2));
}

lastChars
public String lastChars(String a, String b) {
  if (a.length()== 0) {
    a = "@";
  }
  if (b.length()== 0 ){

    b = "@";
  }
  return a.substring(0,1) + b.substring(b.length() -1, b.length());
}

seeColor
public String seeColor(String str) {

  if (str.length()< 3) {
    return "";
  }
  if (str.length() == 3 && !(str.substring(0,3).equals("red"))) {
    return "";
  }
  if (str.substring(0,3).equals("red")){
    return str.substring(0,3);
  }
  if (str.substring(0,4).equals("blue")){
    return str.substring(0,4);

  }
  return "";
}

extraFront
public String extraFront(String str) {
  if (str.length() <2) {
    return str + str + str;
  }

  if (str.length() >= 2) {
    return str.substring(0,2) + str.substring(0,2) + str.substring(0,2);

  }
  return str;
}

startWord
public String startWord(String str, String word) {
  if (word.length()> str.length()) {
    return "";
  } else
    if (str.substring(1,word.length()).equals(word.substring(1,word.length()))){
      return str.substring(0, word.length());
    }
  return "";
}

makeAbba
public String makeAbba(String a, String b) {
  return a+b+b+a;
}

extraEnd
public String extraEnd(String str) {
  return str.substring(str.length()-2) +str.substring(str.length()-2)+str.substring(str.length()-2);
}

withoutEnd
public String withoutEnd(String str) {
  return str.substring(1, str.length()-1);
}

left2
public String left2(String str) {
  return str.substring(2) + str.substring(0,2);
}

withoutEnd2
public String withouEnd2(String str) {
  if (str.length() <=1) {
    return "";
  }
  return str.substring(1, str.length()-1);
}

nTwice
public String nTwice(String str, int n) {
  return (str.substring(0, n) + str.substring(str.length() -n));
}

hasBad
public boolean hasBad(String str) {
  return(str.indexOf("bad") == 0 || str.indexOf("bad") == 1);
}

conCat
public String conCat(String a, String b) {
  if ( a=="" || b =="") return a +b;
  if (a.substring(a.length()-1).equals(b.substring(0,1))) return ( a + b.substring(1));
  return a+b;
}

frontAgain
public boolean frontAgain(String str) {
  if (str.length() <= 1) {
    return false;
  }else{
    return str.substring(0,2).equals(str.substring(str.length()-2));
  }
}

without2
public String without2(String str) {
  if ( str.length() <2) {
    return str;
  } else if(str.substring(0,2).equals(str.substring(str.length()-2,str.length()))) {
    return str.substring(2);
  }
  return str;
}

withoutX
public String withoutX(String str) {
  if (str.length() <=1) {
    return "";
  } else if(str.substring(0,1).equals("x") && str.substring(str.length()-1, str.length()).equals("x")) {
    return str.substring(1, str.length() -1);
  } else if(str.substring(0,1).equals("x")){
    return str.substring(1);
  } else if (str.substring(str.length()-1, str.length()).equals("x")){
    return str.substring(0,str.length()-1);
  }
  return str;

}

makeTags
public String makeTags(String tag, String word) {
  return "<" + tag +">" + word + "</" + tag +">";
}

firstTwo
public String firstTwo(String str) {
  if (str.length() < 2) {
    return str;
  }
  return str.substring(0,2);
}

comboString
public String comboString(String a, String b) {
  if (a.length() < b.length()) {
    return a + b + a;
  }
  return b+a+b;
}

right2
public String right2(String str) {
  return str.substring(str.length()-2) + str.substring(0,str.length()-2);
}

middleTwo
public String middleTwo(String str) {
  int num = (str.length())/2;
  return str.substring(num-1,num+1);
}

twoChar
public String twoChar(String str, int index) {
  if(index+2 > str.length() || index < 1) {
    return str.substring(0,2);
  }
  return str.substring(index, index+2);
}

atFirst
public String atFirst(String str) {
  if (str.length() == 0) {
    return "@@";
  } else if (str.length() == 1) {
    return str + "@";
  }
  return str.substring(0,2);
}

lastTwo
public String lastTwo(String str) {
  if (str.length() < 2) {
    return str;
  }
  return str.substring(0, str.length()-2) + str.substring(str.length()-1,str.length())+ str.substring(str.length()-2,str.length()-1);
}

minCat
public String minCat(String a, String b) {
  if (a.length() > b.length()) {
    return a.substring(a.length() -(b.length())) + b;
  } else if (b.length() > a.length()){
    return a + b.substring(b.length() -(a.length()));
  }
  return a + b;
}

deFront
public String deFront(String str) {
  if ( !(str.charAt(0) == 'a') && !(str.charAt(1) == 'b')) {
    return str.substring(2);
  }else if(str.charAt(0) == 'a'&& !(str.charAt(1) == 'b')) {
    return str.substring(0,1) + str.substring(2);
  }else if(!(str.charAt(0) == 'a')&& (str.charAt(1) == 'b')) {
    return str.substring(1);

  }
  return str;

}

withoutX2
public String withoutX2(String str) {
  if (str.length()< 1 || (str.length() ==1 && str.charAt(0) == 'x')) {
    return "";
  } else if (str.charAt(0) == 'x'&& str.charAt(1) == 'x') {
    return str.substring(2);
  } else if (str.charAt(0) == 'x') {
    return str.substring(1);
  } else if (str.charAt(1) == 'x') {
    return str.substring(0,1) + str.substring(2);
  }
  return str;
}
