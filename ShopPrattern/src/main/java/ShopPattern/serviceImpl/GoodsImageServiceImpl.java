package ShopPattern.serviceImpl;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import ShopPattern.dao.GoodsDao;
import ShopPattern.dao.GoodsImageDao;
import ShopPattern.entity.Goods;
import ShopPattern.entity.GoodsImage;
import ShopPattern.service.GoodsImageService;

@Service
public class GoodsImageServiceImpl implements GoodsImageService{
	
	@Autowired
    private GoodsImageDao goodsImageDao;
    @Autowired
    private GoodsDao goodsDao;


    public void save(GoodsImage goodsImage) {
    	goodsImageDao.save(goodsImage);
    }

    public List<GoodsImage> findAll() {
        return goodsImageDao.findAll();
    }

    public GoodsImage findOne(int id) {
        return goodsImageDao.findOne(id);
    }

    public void delete(int id) {
    	goodsImageDao.delete(id);
    }


    public void saveImage(int idGoods, MultipartFile[] multipartFiles) {

        Goods goods = goodsDao.bookWithimages(idGoods);

        for (MultipartFile multipartFile : multipartFiles) {


            String path = System.getProperty("catalina.home") + "/resources/" + goods.getName() + "/"
                    + multipartFile.getOriginalFilename();

           GoodsImage goodsImage = new GoodsImage("resources/" + goods.getName() + "/" + multipartFile.getOriginalFilename());

           goodsImage.setGoods(goods);


            File file = new File(path);

            try {
                file.mkdirs();
                multipartFile.transferTo(file);
            } catch (IOException e) {
                System.out.println("error with file");
            }

            goodsImageDao.save(goodsImage);


        }


    }

}
