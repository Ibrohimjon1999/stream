public class DtoClone {
    private Long idClone;
    private String nameClone;

    private Dto dto;

    public DtoClone(Long idClone, String nameClone,Dto dto) {
        this.idClone = idClone;
        this.nameClone = nameClone;
        this.dto = dto;
    }

    public DtoClone() {
    }

    public Long getIdClone() {
        return idClone;
    }

    public void setIdClone(Long idClone) {
        this.idClone = idClone;
    }

    public String getNameClone() {
        return nameClone;
    }

    public void setNameClone(String nameClone) {
        this.nameClone = nameClone;
    }

    public Dto getDto() {
        return dto;
    }

    public void setDto(Dto dto) {
        this.dto = dto;
    }

    @Override
    public String toString() {
        return "DtoClone{" +
                "idClone=" + idClone +
                ", nameClone='" + nameClone + '\'' +
                ", dto=" + dto +
                '}';
    }
}
