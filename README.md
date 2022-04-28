# Caesar Cipher

#### Java application that implements a caesar cipher which is a type of substitution in which each letter is shifted a certain number of places known as a key (1-9), down the alphabet(A-Z).

## Description

Caesar Cipher is a Java command line App which shifts letters a certain number of places known as Keys down the alphabets. For example the article "THE" with a key of 3 reads QEB. Each letter is moved 3 places backwards the Alphabets

#### By **[JOSEPH MAINA](https://github.com/JOSEPHMAINA1995)**

## Setup/Installation Requirements

- Make sure you have stable internet connection- Wifi or Cellular. Connect using your Mobile phone or Computer.
- To access the application, form the repository by clicking the form button. Go ahead to clone it to have it on your local repository.
- use git clone command followed by the link: 
- After succesfully cloning, open the application using Intellij already installed in your computer.


## Behavior Driven Development(BDD)

The user is able to;

* Run the application using 

* Input the Characters to encode ie THE

* Key in the key ie 3

* Read the output Provided.

* (It also allows Testing the output before actual running of the App)

## Running the Tests 

Create a test class for running tests in the application.

This is a sample test that tests for character encryption moved three positions backward from its original position.

 @Test
    public void encryptedCharacter_returnsCharMinusThreePositions_THE() {
        encryptedCharacter encryptedCharacter = new encryptedCharacter();
        String expected = "QEB";
        assertEquals(expected, encryptedCharacter.encryptedCharacter("THE", 3));

    }

## Technologies Used

- Java 

### License

MIT License
Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.<br>

Copyright (c) 2022 **JOSEPH MAINA**
