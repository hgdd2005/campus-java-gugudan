class Re {// ����� Ȯ�� ����
	private String text;

	Re(String text) {
		this.text = text;
	}

	public void retry() {
		if (text.equals("n")) {
			System.out.println("���α׷� ����");
			System.exit(0);// ���α׷� ����
		}
	}
}