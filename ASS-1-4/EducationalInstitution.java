class Staff {
  private int code;
  private String name;

  public Staff(int code, String name) {
      this.code = code;
      this.name = name;
  }

  public int getCode() {
      return code;
  }

  public String getName() {
      return name;
  }
}

class Typist extends Staff {
  private int speed;

  public Typist(int code, String name, int speed) {
      super(code, name);
      this.speed = speed;
  }

  public int getSpeed() {
      return speed;
  }
}

class Officer extends Staff {
  private String grade;

  public Officer(int code, String name, String grade) {
      super(code, name);
      this.grade = grade;
  }

  public String getGrade() {
      return grade;
  }
}

class RegularTypist extends Typist {
  private double remuneration;

  public RegularTypist(int code, String name, int speed, double remuneration) {
      super(code, name, speed);
      this.remuneration = remuneration;
  }

  public double getRemuneration() {
      return remuneration;
  }
}

class Teacher extends Staff {
  private String subject;
  private String publication;

  public Teacher(int code, String name, String subject, String publication) {
      super(code, name);
      this.subject = subject;
      this.publication = publication;
  }

  public String getSubject() {
      return subject;
  }

  public String getPublication() {
      return publication;
  }
}

class CasualTypist extends Typist {
  private double dailyWages;

  public CasualTypist(int code, String name, int speed, double dailyWages) {
      super(code, name, speed);
      this.dailyWages = dailyWages;
  }

  public double getDailyWages() {
      return dailyWages;
  }
}

public class EducationalInstitution {
  public static void main(String[] args) {
      Officer officer = new Officer(101, "John Doe", "Grade A");
      RegularTypist regularTypist = new RegularTypist(201, "Jane Smith", 60, 5000.0);
      Teacher teacher = new Teacher(301, "Alice Johnson", "Math", "Research in Education");
      CasualTypist casualTypist = new CasualTypist(401, "Bob Brown", 50, 100.0);

      System.out.println("Officer Information:");
      System.out.println("Code: " + officer.getCode());
      System.out.println("Name: " + officer.getName());
      System.out.println("Grade: " + officer.getGrade());

      System.out.println("\nRegular Typist Information:");
      System.out.println("Code: " + regularTypist.getCode());
      System.out.println("Name: " + regularTypist.getName());
      System.out.println("Speed: " + regularTypist.getSpeed());
      System.out.println("Remuneration: " + regularTypist.getRemuneration());

      System.out.println("\nTeacher Information:");
      System.out.println("Code: " + teacher.getCode());
      System.out.println("Name: " + teacher.getName());
      System.out.println("Subject: " + teacher.getSubject());
      System.out.println("Publication: " + teacher.getPublication());

      System.out.println("\nCasual Typist Information:");
      System.out.println("Code: " + casualTypist.getCode());
      System.out.println("Name: " + casualTypist.getName());
      System.out.println("Speed: " + casualTypist.getSpeed());
      System.out.println("Daily Wages: " + casualTypist.getDailyWages());
  }
}
