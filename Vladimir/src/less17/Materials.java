package src.less17;

public class Materials {

    private int id;
    private String name;
    private int lectureId;
    private ResourceType ResourceType;

    public Materials() {
    }

    public Materials(int id, String name, int lectureId, src.less17.ResourceType resourceType) {
        this.id = id;
        this.name = name;
        this.lectureId = lectureId;
        ResourceType = resourceType;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getLectureId() {
        return lectureId;
    }

    public src.less17.ResourceType getResourceType() {
        return ResourceType;
    }

    @Override
    public String toString() {
        return "Materials{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lectureId=" + lectureId +
                ", ResourceType=" + ResourceType +
                '}';
    }

}
