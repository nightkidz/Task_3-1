// NAMA : Alfian Pamungkas Sakawiguna
// KELAS : IF-38-01
// NIM : 1301144411

public class Project {

	private String projectName;
	private Member[] teamMember = new Member[5];
	private int nTeam = 0;
	private boolean releaseStatus = false;

	public Project(String projectName){
		this.projectName = projectName;
		teamMember = new Member[5];
		releaseStatus = false;
	}
	
	public boolean isReleased(){
		return releaseStatus;
	}
	
	public void releaseApp(){
		releaseStatus = true;
	}
	
	public void addMember(Member m){
			teamMember[nTeam] = m;
			nTeam++;
	}
	
	public String toString(){
		String x;
        if (releaseStatus = true) {
            x = "released";
        } else {
            x = "progress";
        }
        return "Project " + projectName + " status is in " + x + " with team member of " + nTeam;
   }
}
