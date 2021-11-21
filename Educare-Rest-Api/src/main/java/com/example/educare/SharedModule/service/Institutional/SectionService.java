package com.example.educare.SharedModule.service.Institutional;

import com.example.educare.SharedModule.models.Institutional.Section;
import com.example.educare.SharedModule.repository.Institutional.SectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SectionService {
    @Autowired
    private SectionRepository _sectionRepository;

    //    Create new Section
    public Section createSectionService(Section sec) {
        return _sectionRepository.save(sec);
    }
    // Create List of Section
    public List<Section> CreateSectionListService(List<Section> secList) {
        return _sectionRepository.saveAll(secList);
    }

    //    Get all Section
    public List<Section> getAllSectionService() {
        return _sectionRepository.findAll();
    }

    //    Get Section by ID
    public Section getSectionByIdService(Long secId) {
        return _sectionRepository.findById(secId).orElse(null);
    }

    //    Update Section
    public  Section updateSectionService(Long id, Section sec) {

        Optional<Section> data = _sectionRepository.findById(id);
        Section _section = data.get();

        _section.setSectionName(sec.getSectionName());
        _section.setSession(sec.getSession());
        _section.setRoomNo(sec.getRoomNo());

        return _sectionRepository.save(_section);
    }

    //    Delete Section by ID
    public void deleteSecByIdService(Long id) {
        _sectionRepository.deleteById(id);
    }

    //    Delete All Institution Data
    public void deleteAllSecService() {
        _sectionRepository.deleteAll();
    }

}
