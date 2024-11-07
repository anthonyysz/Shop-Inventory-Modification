package com.example.demo.bootstrap;

import com.example.demo.domain.InhousePart;
import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.InhousePartRepository;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;

    private final OutsourcedPartRepository outsourcedPartRepository;
    private final InhousePartRepository inhousePartRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository, InhousePartRepository inhousePartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository=outsourcedPartRepository;
        this.inhousePartRepository = inhousePartRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        if(inhousePartRepository.count() == 0) {

            //Adding inhouse parts needed for computer
            InhousePart cpuAMS = new InhousePart(); //creating the part
            cpuAMS.setName("AMS CPU"); //setting the part's name
            cpuAMS.setInv(100); //setting the part's inventory
            cpuAMS.setPrice(200); //setting the part's price
            cpuAMS.setId(1); //setting the part's ID
            cpuAMS.setMaxInv(200); //setting the part's maximum inventory
            cpuAMS.setMinInv(0); //setting the part's minimum inventory
            inhousePartRepository.save(cpuAMS); //saving the part to the repository
            //this is repeated for all parts

            InhousePart coolerAMS = new InhousePart();
            coolerAMS.setName("AMS CPU Cooler");
            coolerAMS.setInv(200);
            coolerAMS.setPrice(30);
            coolerAMS.setId(2);
            coolerAMS.setMaxInv(200);
            coolerAMS.setMinInv(0);
            inhousePartRepository.save(coolerAMS);

            InhousePart motherboardAMS = new InhousePart();
            motherboardAMS.setName("AMS Motherboard");
            motherboardAMS.setInv(100);
            motherboardAMS.setPrice(100);
            motherboardAMS.setId(3);
            motherboardAMS.setMaxInv(200);
            motherboardAMS.setMinInv(0);
            inhousePartRepository.save(motherboardAMS);

            InhousePart gpuAMS = new InhousePart();
            gpuAMS.setName("AMS GPU");
            gpuAMS.setInv(100);
            gpuAMS.setPrice(200);
            gpuAMS.setId(4);
            gpuAMS.setMaxInv(200);
            gpuAMS.setMinInv(0);
            inhousePartRepository.save(gpuAMS);

            InhousePart ramAMS = new InhousePart();
            ramAMS.setName("AMS 16gb RAM");
            ramAMS.setInv(200);
            ramAMS.setPrice(50);
            ramAMS.setId(5);
            ramAMS.setMaxInv(200);
            ramAMS.setMinInv(0);
            inhousePartRepository.save(ramAMS);

            InhousePart powerAMS = new InhousePart();
            powerAMS.setName("AMS 650 Watt Power Supply");
            powerAMS.setInv(150);
            powerAMS.setPrice(50);
            powerAMS.setId(6);
            powerAMS.setMaxInv(200);
            powerAMS.setMinInv(0);
            inhousePartRepository.save(powerAMS);

            InhousePart caseAMS = new InhousePart();
            caseAMS.setName("AMS ATX Computer Case");
            caseAMS.setInv(200);
            caseAMS.setPrice(75);
            caseAMS.setId(7);
            caseAMS.setMaxInv(200);
            caseAMS.setMinInv(0);
            inhousePartRepository.save(caseAMS);

            InhousePart halfAMS = new InhousePart();
            halfAMS.setName("AMS 500gb SSD");
            halfAMS.setInv(200);
            halfAMS.setPrice(50);
            halfAMS.setId(8);
            halfAMS.setMaxInv(200);
            halfAMS.setMinInv(0);
            inhousePartRepository.save(halfAMS);

            InhousePart tbAMS = new InhousePart();
            tbAMS.setName("AMS 1tb SSD");
            tbAMS.setInv(200);
            tbAMS.setPrice(75);
            tbAMS.setId(9);
            tbAMS.setMaxInv(200);
            tbAMS.setMinInv(0);
            inhousePartRepository.save(tbAMS);
        }

        //repeated once again for outsourced parts
        if(outsourcedPartRepository.count() == 0) {
            OutsourcedPart notR7 = new OutsourcedPart();
            notR7.setName("NotAMD Ryzen 7");
            notR7.setInv(100);
            notR7.setPrice(250);
            notR7.setId(10);
            notR7.setMaxInv(200);
            notR7.setMinInv(0);
            outsourcedPartRepository.save(notR7);

            OutsourcedPart notAMDCooler = new OutsourcedPart();
            notAMDCooler.setName("NotAMD Ryzen 7 Cooler");
            notAMDCooler.setInv(100);
            notAMDCooler.setPrice(50);
            notAMDCooler.setId(11);
            notAMDCooler.setMaxInv(200);
            notAMDCooler.setMinInv(0);
            outsourcedPartRepository.save(notAMDCooler);

            OutsourcedPart notRad7 = new OutsourcedPart();
            notRad7.setName("NotAMD Radeon 7600");
            notRad7.setInv(100);
            notRad7.setPrice(300);
            notRad7.setId(12);
            notRad7.setMaxInv(200);
            notRad7.setMinInv(0);
            outsourcedPartRepository.save(notRad7);
        }

        //repeated again for products, but without a maximum and minimum inventory
        if(productRepository.count() == 0) {
            Product AMSComputerHalf = new Product();
            AMSComputerHalf.setName("AMS Computer 500gb");
            AMSComputerHalf.setInv(20);
            AMSComputerHalf.setPrice(700);
            AMSComputerHalf.setId(21);
            productRepository.save(AMSComputerHalf);

            Product AMSComputerTB = new Product();
            AMSComputerTB.setName("AMS Computer 1tb");
            AMSComputerTB.setInv(20);
            AMSComputerTB.setPrice(750);
            AMSComputerTB.setId(22);
            productRepository.save(AMSComputerTB);

            Product AMSComputerRyzenHalf = new Product();
            AMSComputerRyzenHalf.setName("NotAMD Ryzen 7 Computer AMS Build 500gb");
            AMSComputerRyzenHalf.setInv(20);
            AMSComputerRyzenHalf.setPrice(800);
            AMSComputerRyzenHalf.setId(23);
            productRepository.save(AMSComputerRyzenHalf);

            Product AMSComputerRyzenTB = new Product();
            AMSComputerRyzenTB.setName("NotAMD Ryzen 7 Computer AMS Build 1tb");
            AMSComputerRyzenTB.setInv(20);
            AMSComputerRyzenTB.setPrice(850);
            AMSComputerRyzenTB.setId(24);
            productRepository.save(AMSComputerRyzenTB);

            Product AMSComputerRyzenRadeonHalf = new Product();
            AMSComputerRyzenRadeonHalf.setName("NotAMD Ryzen 7 Radeon 7600 Computer AMS Build 500gb");
            AMSComputerRyzenRadeonHalf.setInv(20);
            AMSComputerRyzenRadeonHalf.setPrice(850);
            AMSComputerRyzenRadeonHalf.setId(24);
            productRepository.save(AMSComputerRyzenRadeonHalf);

            Product AMSComputerRyzenRadeonTB = new Product();
            AMSComputerRyzenRadeonTB.setName("NotAMD Ryzen 7 Radeon 7600 Computer AMS Build 1tb");
            AMSComputerRyzenRadeonTB.setInv(20);
            AMSComputerRyzenRadeonTB.setPrice(850);
            AMSComputerRyzenRadeonTB.setId(24);
            productRepository.save(AMSComputerRyzenRadeonTB);
        }
    }
}
