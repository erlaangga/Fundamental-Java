

/*
Operator biner
+ (Addition)	Adds values on either side of the operator.
- (Subtraction)	Subtracts right-hand operand from left-hand operand.
* (Multiplication)	Multiplies values on either side of the operator.
/ (Division)	Divides left-hand operand by right-hand operand.	
% (Modulus)	Divides left-hand operand by right-hand operand and returns remainder.	
++ (Increment)	Increases the value of operand by 1.	
-- (Decrement)	Decreases the value of operand by 1.	
 */

/*
Operator Logika/Relasi
== (equal to)	Checks if the values of two operands are equal or not, if yes then condition becomes true.
!= (not equal to)	Checks if the values of two operands are equal or not, if values are not equal then condition becomes true.
> (greater than)	Checks if the value of left operand is greater than the value of right operand, if yes then condition becomes true.
< (less than)	Checks if the value of left operand is less than the value of right operand, if yes then condition becomes true.
>= (greater than or equal to)	Checks if the value of left operand is greater than or equal to the value of right operand, if yes then condition becomes true.
<= (less than or equal to)	Checks if the value of left operand is less than or equal to the value of right operand, if yes then condition becomes true.
 */

/*
Bitwise Operator
& (bitwise and)	Binary AND Operator copies a bit to the result if it exists in both operands.
| (bitwise or)	Binary OR Operator copies a bit if it exists in either operand.
^ (bitwise XOR)	Binary XOR Operator copies the bit if it is set in one operand but not both.
~ (bitwise compliment)	Binary Ones Complement Operator is unary and has the effect of 'flipping' bits.	(~A ) will give -61 which is 1100 0011 in 2's complement form due to a signed binary number.
<< (left shift)	Binary Left Shift Operator. The left operands value is moved left by the number of bits specified by the right operand.
>> (right shift)	Binary Right Shift Operator. The left operands value is moved right by the number of bits specified by the right operand.
>>> (zero fill right shift)	Shift right zero fill operator. The left operands value is moved right by the number of bits specified by the right operand and shifted values are filled up with zeros. 

 */

/*
Operator Logika
&& (logical and)	Called Logical AND operator. If both the operands are non-zero, then the condition becomes true.
|| (logical or)	Called Logical OR Operator. If any of the two operands are non-zero, then the condition becomes true.
! (logical not)
 */

/*
Assignment Operator
=	Simple assignment operator. Assigns values from right side operands to left side operand.	C = A + B will assign value of A + B into C
+=	Add AND assignment operator. It adds right operand to the left operand and assign the result to left operand.	C += A is equivalent to C = C + A
-=	Subtract AND assignment operator. It subtracts right operand from the left operand and assign the result to left operand.	C -= A is equivalent to C = C – A
*=	Multiply AND assignment operator. It multiplies right operand with the left operand and assign the result to left operand.	C *= A is equivalent to C = C * A
/=	Divide AND assignment operator. It divides left operand with the right operand and assign the result to left operand.	C /= A is equivalent to C = C / A
%=	Modulus AND assignment operator. It takes modulus using two operands and assign the result to left operand.	C %= A is equivalent to C = C % A
<<=	Left shift AND assignment operator.	C <<= 2 is same as C = C << 2
>>=	Bitwise AND assignment operator.	C >>= 2 is same as C = C >> 2
&=	Right shift AND assignment operator.	C &= 2 is same as C = C & 2
^=	bitwise exclusive OR and assignment operator.	C ^= 2 is same as C = C ^ 2
|=	bitwise inclusive OR and assignment operator.	C |= 2 is same as C = C | 2
 */

/*
Coditional/Ternary Operator
?:
expression?value_true:value_false
 */

// blok program pada java ditandai dengan tanda kurung kurawal

public class Dummy {
	public static void main(String[] args) {
		// perulangan dengan for
		for(int i=1000;i>=12;i-=10){
			System.out.println("Ini adalah nilai ke: "+i);
		}
		
		int tes     = 100;
		
		
		for (int i = 100; i >= 0; i--){
			tes+=i;
			System.out.println("Nilai tes: " +      tes);
		}
		
		System.out.print(tes == 5150);
		
		double a = 5.8;
		System.out.println("Isi nilai a: "+a);
		int b = (int) a;
		System.out.println("Isi nilai b: "+b);
		double c = Math.floor(a);
		System.out.println("Isi c: " + c);
		int d = (int)c;
		System.out.println("Isi d: "+d);
		
		// di bawah adalah contoh if satu baris
		// spasi atau enter tidak berpengaruh pada Java
		if(a == 5.8) System.out.printf("Isi a adalah: %d ditambah %.1f \n",(int) a, a-5.0);
		if(a == 5.8)
		System.out.printf("Isi a adalah: %d ditambah %.1f \n",(int) a, a-5.0);
		
	}
}
