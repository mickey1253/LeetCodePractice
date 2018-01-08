package code.lint.eight.dataStructure;


/*
*
* In data structure Hash, hash function is used to convert
* a string(or any other type)
* into an integer smaller than hash size and bigger or equal to zero.
* The objective of designing a hash function is to "hash"
* the key as unreasonable as possible.
* A good hash function can avoid collision as less as possible.
* A widely used hash function algorithm is using a magic number 33,
* consider any string as a 33 based big integer like follow:

hashcode("abcd") = (ascii(a) * 333 + ascii(b) * 332 +
ascii(c) *33 + ascii(d)) % HASH_SIZE

                 = (97* 333 + 98 * 332 + 99 * 33 +100) % HASH_SIZE

                 = 3595978 % HASH_SIZE

here HASH_SIZE is the capacity of the hash table
(you can assume a hash table is like an array with index 0 ~ HASH_SIZE-1).

Given a string as a key and the size of hash table,
return the hash value of this key.f



Have you met this question in a real interview? Yes
Clarification
For this problem, you are not necessary to design your own hash algorithm or consider any collision issue, you just need to implement the algorithm as described.

Example
For key="abcd" and size=100, return 78
*
* */
public class HashFunction {

    public static void main(String[] args){

        char[] key = {'a', 'b', 'c', 'd'};

        int HASH_SIZE = 100;

        int result = hashCode(key, HASH_SIZE);

        System.out.println("The result is: " + result);

    }


    public static int hashCode(char[] key, int HASH_SIZE) {
        // write your code here

        if(key == null){
            return 0;
        }

        long sum = 0;
        for(int i = 0 ; i < key.length; i++){
          //  sum += ((int) key[i]) * Math.pow(33, (double) (key.length -1 - i) );

            sum = (33 * sum + (int)(key[i])) % HASH_SIZE;
        }

        return (int)sum;

    }


    // JIU ZHANG's Answer

    /*
    *
    *  public int hashCode(char[] key,int HASH_SIZE) {
        long ans = 0;
        for(int i = 0; i < key.length;i++) {
            ans = (ans * 33 + (int)(key[i])) % HASH_SIZE;
        }
	return (int)ans;
    }
    *
    * */


    // Shuo Chang's Answer

    //
    // @param key: A String you should hash
    // @param HASH_SIZE: An integer
    // @return an integer
    //
  /*
    public int hashCode(char[] key,int HASH_SIZE) {

        long sum = 0;
        for (int i = 0; i < key.length; i++){
            sum = sum * 33  + key[i];
            sum = sum % HASH_SIZE;
        }
        return (int)sum;
    }

    */
}
