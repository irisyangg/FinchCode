# Finch Robot

### Development Checklist

| Completed | Task         | Description |
|:---------:| :-----------:|:------------|
|    ✅     | Familiarize  | Learn how to: <ul><li>Connect to the robot</li><li>Interpret what built-in sensors detect</li><li>Program basics in SNAP!</li><li>Setup local developing environment to code in Java</li></ul>|
|    ✅     | 3D Design    |   Learn how to: <ul><li>Design basic 3D models</li><li>Prototype</li><li>Fix design issues</li><li>Proportion right dimsensions</li></ul>          |
|    ✅     | Develop Code |  Learn how to: <ul><li>Debug</li><li>Code in a different setting</li><li>Work with robotic movements</li><li>Incorporate logic, STEM, and creativity</li></ul>           |

---

<details>
<summary><strong>Inspiration for the Project</strong></summary>
	
_**I was looking at different flowers while out shopping one day; I've always wanted to grow my own garden. That same day, I was also brainstorming for possible 3D modeling designs. I decided to create one for a flower pot and some little flowers for fun. The first prototype came out the perfect size immediately, so with a passion for flowers and games, a flower throwing game was started.**_
</details>

---

### Design Cycle
<img src="design cycle.png" alt="design cycle" width="300" height="260">

_**For the ask portion of the design cycle, I had to ask a bunch of peers for help. It was hard to navigate and utilize a new place to code, and downloading and creating the software to even start was worse than the actual coding. Research, it was mainly finding the right measurements of the Finch robot and learning how to use Tinkercad to create the 3D model I needed. Imagine, I had to imagine how I was going to code this with limited knowledge on what I know versus what I can do. There was many ways for the robot to move once it's the next player's turn, however, I had to come up with one that I knew how to do instead of the complex google ones. For planning, it was a rough sketch of what I learned in AP CSP, the on-event button; I connected that idea with the scanner option in java and decided that the players can manually hit enter when a flower is successfully thrown inside the pot. Creating, thankfully the first 3D model prototypes were good as is, so all I had to do was code. Most of what I used were preset in the Finch program, so it wasn't too bad. For testing, I reached out to a friend for peer editing, which made it easier and more fun. I had to spend some time adjusting the rotate and length of the movements, as it wasn't working right for some time. We eventually figured it out, it was just a simpe syntax error. To improve, I just added some finishing touches, like the LED prints at the end.**_

---

### Code to Highlight
```java

       int totalRounds = 5;
       for (int round = 1; round <= totalRounds; round++) {
           System.out.println(round + " out of " + totalRounds);
           System.out.println("press enter when a flower is dropped into the pot");
           scanner.nextLine(); 
          
           myFinch.setLED(0, 255, 0);  /// green
           myFinch.setMove("F",100.0,100); 
           myFinch.setLED(0, 0, 0); // no color
           myFinch.setTurn("R",220.0,50);
       }
       myFinch.print("game over!");
```

---

###  Why I built this project: 
*Since I wanted to make like a game with these robots, I might as well make it about something I like. It's pretty simple so everyone can play. It honestly reminds me of growing a garden almost, which fulfills that dream of mine in a more technological sense.*
###  Problems it solves: 
*Since it is manual that you hit enter whenever you hit enter, this code can be preserved and used for other things that aren't just this flower game. It could be useful for carrying and traveling things back and forth as you can replace the pot with just about anything else that fits. If you're ever too lazy to bring something to something, you can use this to send it their way and make it come back all with a click of a button.*
###  What I learned: 
*I learned a lot on how to adapt to a new software. To be honest, the hardest part is setting this up so this gave experience so if I ever need to code for someone else, I can navigate their programs easier. It also gave me a physical sense of what code does, which helps my understanding as I am more of a visual person. Seeing the errors in person and within each test try was easier to debug than just simply staring at a red screen, not being able to find the details at all that are incorrect.*
