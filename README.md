# finch-robot

### Development Checklist

| Completed | Task         | Description |
|:---------:| :-----------:|:------------|
|    ✅     | Familiarize  | Learn how to: <ul><li>Connect to the robot</li><li>Interpret what built-in sensors detect</li><li>Program basics in SNAP!</li><li>Setup local developing environment to code in Java</li></ul>|
|    ✅     | 3D Design    |   Learn how to: <ul><li>Design basic 3D models</li><li>Prototype</li><li>Fix design issues</li><li>Proportion right dimsensions</li></ul>          |
|    ✅     | Develop Code |  Learn how to: <ul><li>Debug</li><li>Code in a different setting</li><li>Work with robotic movements</li><li>Incorporate logic, STEM, and creativity</li></ul>           |

---

<details>
<summary><strong>Inspiration for the Project</strong></summary>

I was looking at different flowers while out shopping one day; I've always wanted to grow my own garden. That same day, I was also brainstorming for possible 3D modeling designs. I decided to create one for a flower pot and some little flowers for fun. The first prototype came out the perfect size immediately, so with a passion for flowers and games, a flower throwing game was started. 
</details>

---

### Design Cycle
<img src="design cycle.png" alt="design cycle" width="300" height="260">

**For the ask portion of the design cycle, I had to ask a bunch of peers for help. It was hard to navigate and utilize a new place to code, and downloading and creating the software to even start was worse than the actual coding. Research, it was mainly finding the right measurements of the Finch robot and learning how to use Tinkercad to create the 3D model I needed. Imagine, I had to imagine how I was going to code this with limited knowledge on what I know versus what I can do. There was many ways for the robot to move once it's the next player's turn, however, I had to come up with one that I knew how to do instead of the complex google ones. For planning, it was a rough sketch of what I learned in AP CSP, the on-event button; I connected that idea with the scanner option in java and decided that the players can manually hit enter when a flower is successfully thrown inside the pot. Creating, thankfully the first 3D model prototypes were good as is, so all I had to do was code. Most of what I used were preset in the Finch program, so it wasn't too bad. For testing, I reached out to a friend for peer editing, which made it easier and more fun. I had to spend some time adjusting the rotate and length of the movements, as it wasn't working right for some time. We eventually figured it out, it was just a simpe syntax error. To improve, I just added some finishing touches, like the LED prints at the end.**

---

### Code to Highlight
```java
public static void followLine(Finch f) {
	int left = f.getLine("L");
	int right = f.getLine("R");
	
	System.out.println("left: " + left + " right: " + right);
	if (left < 90) {
		f.setMotors(0, 10);
	} else if (right > 90) {
		f.setMotors(10, 0);
	} else {
		f.setMotors(10, 10);
	}
	f.pause(.1);
}
```

---

### Choose At Least Three of the Following to Include:
- What was your motivation?
- Why did you build this project? (Note: the answer is not "Because it was a homework assignment.")
- What problem does it solve?
- What did you learn?
- What makes your project stand out?
