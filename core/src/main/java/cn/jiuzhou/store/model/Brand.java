package cn.jiuzhou.store.model;

public class Brand {
    private Long brandId;

    private String brandName;

    private String brandDesc;

    private String imgs;

    private String website;

    private Integer brandSort;

    public Brand(Long brandId, String brandName, String brandDesc, String imgs, String website, Integer brandSort) {
        this.brandId = brandId;
        this.brandName = brandName;
        this.brandDesc = brandDesc;
        this.imgs = imgs;
        this.website = website;
        this.brandSort = brandSort;
    }

    public Brand() {
        super();
    }

    public Long getBrandId() {
        return brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName == null ? null : brandName.trim();
    }

    public String getBrandDesc() {
        return brandDesc;
    }

    public void setBrandDesc(String brandDesc) {
        this.brandDesc = brandDesc == null ? null : brandDesc.trim();
    }

    public String getImgs() {
        return imgs;
    }

    public void setImgs(String imgs) {
        this.imgs = imgs == null ? null : imgs.trim();
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website == null ? null : website.trim();
    }

    public Integer getBrandSort() {
        return brandSort;
    }

    public void setBrandSort(Integer brandSort) {
        this.brandSort = brandSort;
    }
}