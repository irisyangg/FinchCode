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
<img src="design_cycle.png" alt="design cycle" width="300" height="300">

###### Include commentary on your experience with the design cycle during this project

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
