package bigOAndSampleProblems;

public class SampleProblems {
    /*
    * These are solutions to problems taken from codingbat.com
    *
    * Suggestion: Go to codingbat.com, make an account, and continue to
    * practice your programming
    * */


    // Warm-up 2 Problems
    public String stringTimes(String str, int n) {
        String answer = "";

        for (int i = 0; i < n; ++i) {
            answer += str;
        }

        return answer;
    }

    public String stringBits(String str) {
        String answer = "";

        for (int i = 0; i < str.length(); ++i) {
            if (i % 2 == 0) {
                answer += str.charAt(i);
            }
        }

        return answer;
    }

    public int arrayCount9(int[] nums) {
        int num9s = 0;

        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] == 9) {
                ++num9s;
            }
        }

        return num9s;
    }

    public String stringX(String str) {
        if (str.length() == 0) {
            return "";
        }

        String answer = str.substring(0, 1);

        for (int i = 1; i < str.length() - 1; ++i) {
            if (str.charAt(i) != 'x' && str.charAt(i) != 'X') {
                answer += str.charAt(i);
            }
        }

        if (str.length() > 1) {
            answer += str.charAt(str.length() - 1);
        }

        return answer;
    }

    // Array 2 Problems
    public int matchUp(int[] nums1, int[] nums2) {
        int count = 0;

        for (int i = 0; i < nums1.length; ++i) {
            int diff = (int) Math.abs(nums1[i] - nums2[i]);
            if (diff != 0 && diff <= 2) {
                ++count;
            }
        }

        return count;
    }

    public boolean tripleUp(int[] nums) {
        int count = 1;

        for (int i = 1; i < nums.length; ++i) {
            if (nums[i-1] == nums[i] - 1) {
                ++count;
            } else {
                count = 1;
            }

            if (count == 3) {
                return true;
            }
        }

        return false;
    }

    public int[] tenRun(int[] nums) {
        int change = -1;

        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] % 10 == 0) {
                change = nums[i];
            } else if (change != -1) {
                nums[i] = change;
            }
        }

        return nums;
    }

    public boolean either24(int[] nums) {
        boolean next2 = false;
        boolean next4 = false;

        for (int i = 1; i < nums.length; ++i) {
            if (nums[i-1] == 2 && nums[i] == 2) {
                next2 = true;
            } else if (nums[i-1] == 4 && nums[i] == 4) {
                next4 = true;
            }
        }

        return (next2 && !next4) || (!next2 && next4);
    }
}
