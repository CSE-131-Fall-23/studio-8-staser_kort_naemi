package studio8;

public class Question {
	private String prompt;
	private String answer;
	private int points;
	
	public Question(String prompt, String answer, int points) {
		this.setPrompt(prompt);
		this.answer = answer;
		this.points = points;
	}
	
	public void displayPrompt() {
		System.out.println(this.getPrompt() + "(" + this.points + " points)");
	}
	
	public int checkAnswer(String givenAnswer) {
		if(answer.equals(givenAnswer)) { //String comparison
			return this.points;
		} else {
			return 0;
		}
	}
	
	public int getPoints() {
		return this.points;
	}
	
	public String getAnswer() {
		return this.answer;
	}
	
	public static void main(String[] args) {
		Question q = new Question("What number studio is this?", "8", 2);
		q.displayPrompt();
		System.out.println(q.checkAnswer("hi"));
		System.out.println(q.checkAnswer("8"));
	}

	public String getPrompt() {
		return prompt;
	}

	public void setPrompt(String prompt) {
		this.prompt = prompt;
	}
}
