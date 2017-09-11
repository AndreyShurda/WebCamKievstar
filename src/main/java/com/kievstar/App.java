package com.kievstar;

import com.kievstar.models.*;
import com.kievstar.repositories.*;
import com.kievstar.service.SubscriberService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;


//@Import(JpaConfiguration.class)
@SpringBootApplication(scanBasePackages = {"com.kievstar"})
// same as @Configuration @EnableAutoConfiguration @ComponentScan
//@ComponentScan(basePackages = "com.kievstar")
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @Bean
    public CommandLineRunner demo(WebCameraRepository webCameraRepository, //AddressRepository addressRepository,
                                  SubscriberRepository subscriberRepository, SMSRepository smsRepository,
                                  MMSRepository mmsRepository, ImageRepository imageRepository,
                                  SubscriberService subscriberService) {
        return (args) -> {
//            Theme theme = new Theme();
//            theme.setTitle("test insert title");
//            Comment comment = new Comment();
//            comment.setMessage("test insert message");
//            comment.setDateTime(LocalDateTime.now());
//            comment.setUser(userRepository.findOne(2L));
//            theme.getComments().add(comment);
//
//            themeRepository.save(theme);

//            WebCamera webCamera = new WebCamera();
            WebCamera webCamera = webCameraRepository.findOne(1L);
//            webCamera.setAddress(addressRepository.findOne(1L));
            webCamera.setIp("192.168.200.11");


            Image image = new Image();
            image.setDateTime(LocalDateTime.now());
            image.setWebCamera(webCamera);
            image.setImage(new byte[]{1, 2, 3});

//            imageRepository.save(image);
//            webCameraRepository.save(webCamera);


//            Address address = new Address();
//            address.setCity("kiev");
//            address.setStreet("volodumursika 68");
//
////            addressRepository.save(address);
//            Address addressOne = addressRepository.findOne(1L);
//
//            SMS sms = new SMS();
//            sms.setDateTime(LocalDateTime.now());
////            sms.addAddress(addressOne);
//
//            SubscriberService subscriberService = new SubscriberService();

            Subscriber subscriber = new Subscriber();
            subscriber.setPhoneNumber("+38067111111");

            subscriberRepository.save(subscriber);
//
//
//            SMS smsOne = smsRepository.findOne(1L);
//            smsOne.setSubscriber(subscriberRepository.findOne(1L));
//            Set<Address> addresses = smsOne.getAddresses();
//            addresses.add(addressRepository.findOne(1L));
//
//            smsOne.setAddresses(addresses);
//
////            smsRepository.save(smsOne);
//
//            Subscriber oneSub = subscriberRepository.findOne(1L);
//            MMS mms = new MMS();
//            mms.setSubscriber(oneSub);
////            mmsRepository.save(mms);
//
//
//
////            oneSub.getMmsList().add(mms);
//
////            subscriberRepository.save(oneSub)


//            smsRepository.save(sms);


//            webCamera.setAddress(address);
//            Set<Image> images = new HashSet<>();
//            Image image = new Image();
//            image.setDateTime(LocalDateTime.now());
//            image.setImage(new byte[3]);
//            image.setWebCamera(webCamera);
//
//            images.add(image);
//            webCamera.setImages(images);
//
//            Subscriber subscriber = new Subscriber();
//
//            List<SMS> smsList = new ArrayList<>();
//            smsList.add(new SMS(LocalDateTime.now(), null, subscriber));
//            subscriber.setSmsList(smsList);

//            subscriberRepository.save(subscriber);


        };
    }
}
