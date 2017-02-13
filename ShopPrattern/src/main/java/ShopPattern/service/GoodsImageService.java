package ShopPattern.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import ShopPattern.entity.GoodsImage;

public interface GoodsImageService {
    void save(GoodsImage bookImage);
    List<GoodsImage> findAll();
    GoodsImage findOne(int id);
    void delete(int id);

    void saveImage(int idGoods, MultipartFile [] multipartFiles);
}
