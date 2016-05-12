firstLast6
public boolean firstLast6(int[] nums) {
  if (nums[0]==6 || nums[nums.length -1] == 6) {
    return true;
  }
  return false;
}

commonEnd
public boolean commonEnd(int[] a, int[] b) {

  if (a[0] == b[0] ||  a[a.length -1] == b[b.length -1]) return true;
  return false;
}

reverse3
public int[] reverse3(int[] nums) {
  int[] n = {nums[2], nums[1], nums[0]};
  return n;
}

middleWay
public int[] middleWay(int[] a, int[] b) {
  int[] c = new int[]{ a[1], b[1] };
  return c;
}

no23
public boolean no23(int[] nums) {
  if ((nums[0] == 2 || nums[0] == 3)||(nums[1] == 2 || nums[1] == 3)) {
    return false;
  }
  return true;
}

fix23
public int[] fix23(int[] nums) {

  if (nums[0] == 2 && nums[1] == 3){
    int[] n = new int[] {nums[0], 0, nums[2]};
    return n;
  }else if (nums[1] == 2 && nums[2] == 3) {
    int[] n = new int [] {nums[0], nums[1], 0};
    return n;
  }

  return nums;
}

makeMiddle
public int[] makeMiddle(int[] nums) {
  int mid = (nums.length-1)/2;
  int[] n = new int [] {nums[mid], nums[mid+1]};
  return n;
}

midThree
public int[] midThree(int[] nums) {
  int mid = (nums.length-1)/2;
  int[] n = new int [] {nums[mid -1], nums[mid], nums[mid+1]};
  return n;
}

unlucky1
public boolean unlucky1(int[] nums) {
  if ( nums.length <=1) return false;
  if (nums[0] ==1 && nums[1] == 3 || nums[1] ==1 && nums[2] == 3 || nums[nums.length-2] == 1 && nums[nums.length-1] == 3) {
    return true;
  }
  return false;
}

sameFirstLast
public boolean sameFirstLast(int[] nums) {
  return (nums.length >=1 && nums[0] == nums[nums.length -1]);

}

sum3
public int sum3(int[] nums) {
  int sum = 0;
  for (int i = 0; i <nums.length; i++) {
    sum = sum + nums[i];
  }
  return sum;
}

maxEnd3
public int[] maxEnd3(int[] nums) {
  int index = Math.max(nums[0], nums[2]);
  int[] n = new int[]{index, index, index};
  return n;
}

makeEnds
public int[] makeEnds(int[] nums) {
  int[] n = new int[] {nums[0], nums[nums.length -1]};
  return n;
}

makeLast
public int[] makeLast(int[] nums) {
  int[] np = new int[2 * nums.length];
  np[np.length-1]= nums[nums.length-1];
  return np;
}

start1
public int start1(int[] a, int[] b) {
  int count = 0;
  if (a.length < 1  && b.length <1) return 0;
  if ((a.length < 1 && b[0] == 1) || (a[0] == 1 && b.length <1))  return 1;
  if (a.length < 1  || b.length <1) return 0;

  if (a[0] > 0 && a[0] == 1) {
    count ++;
  }
  if (b[0] > 0 && b[0] == 1) {
    count ++;
  }
  return count;

}

plusTwo
public int[] plusTwo(int[] a, int[] b) {
  int[] new_array = new int[]{a[0], a[1], b[0], b[1]};
  return new_array;
}

maxTriple
public int maxTriple(int[] nums) {
  int middle = nums.length/2;
  int compare = Math.max(nums[0], nums[middle]);
  return Math.max(compare, nums[nums.length-1]);
}

makePi
public int[] makePi() {
  int[] pi = new int[] {3, 1, 4};
  return pi;
}

rotateLeft3
public int[] rotateLeft3(int[] nums) {
  int[] n = new int[] {nums[1], nums[2], nums[0]};
  return n;
}

sum2
public int sum2(int[] nums) {
  if (nums.length == 0) {
    return nums.length;
  } else if (nums.length == 1) {
    return nums[0];
  }
  return nums[0] + nums[1];
}

has23
public boolean has23(int[] nums) {
  return(nums[0]== 2 ||nums[1] == 2 || nums[0] == 3 || nums[1] == 3);
}

double23
public boolean double23(int[] nums) {
  if (nums.length == 2 &&(nums[0]==2 && nums[1]== 2 || nums[0]==3 && nums[1]== 3 )){
    return true;
  }else if(nums.length > 2 && (nums[0]==2 && nums[1]== 2|| nums[0]==3 && nums[1]== 3)) {
    return false;
  }
  return false;
}

biggerTwo
public int[] biggerTwo(int[] a, int[] b) {
  int big_a = a[0] + a[1];
  int big_b = b[0] + b[1];
  if (big_a == big_b) {
    return a;
  }else if (big_a > big_b) {
    return a;
  }
  return b;
}

