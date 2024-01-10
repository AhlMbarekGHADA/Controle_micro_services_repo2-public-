
@Service
public class EtudiantService {
    @Autowired
    private EtudiantRepository etudiantRepository;

    @Autowired
    private RestTemplate restTemplate;

    public CoursEntity getCoursByEtudiantId(Long etudiantId) {
        EtudiantEntity etudiant = etudiantRepository.findById(etudiantId)
                .orElseThrow(() -> new EntityNotFoundException("Étudiant non trouvé"));

        // Appel au microservice Cours
        return restTemplate.getForObject("http://cours-microservice/cours/" + etudiant.getCours().getId(), CoursEntity.class);
    }

}
