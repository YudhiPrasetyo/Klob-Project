@AutomationKlobHubungiKami
  Feature: Automation Hubungi Kami on Klob

    @PositifHubungiKami
    Scenario: Mengirimkan pertanyaan pada tiket baru menggunakan data valid
      Given user berada di landing page
      When user klik link hubungi kami
      Then user seharusnya melihat form hubungi kami
      When user klik field emailContactUs ""
      And klik button jenis pertanyaan
      Then muncul dropdown jenis pertanyaan
      When user pilih saran
      And user input detail pesan "cuma saran"
      And user upload foto contact us
      And klik button kirim pesan
      #Then muncul text terima kasih telah menghubungi kami
      Then user seharusnya melihat error message


    @CariContactUs
    Scenario: cari tiket pada contact us
      Given user berada di landing page
      When user klik link hubungi kami
      Then user seharusnya melihat form hubungi kami
      When user klik button lihat tiket anda
      Then user seharusnya melihat form lihat tiket anda
      When user input nomor tiket "MSN000019"
      And user input email tiket "klobdaya@gmail.com"
      And user klik button cari tiket
      Then user seharusnya melihat form tiket result

    @TambahTanggapanContactUs
    Scenario: tambah tanggapan pada contact us
      Given user berada di landing page
      When user klik link hubungi kami
      Then user seharusnya melihat form hubungi kami
      When user klik button lihat tiket anda
      Then user seharusnya melihat form lihat tiket anda
      When user input nomor tiket "MSN000019"
      And user input email tiket "klobdaya@gmail.com"
      And user klik button cari tiket
      Then user seharusnya melihat form tiket result
      When user tambah detail pesan "aku takut aja"
      And user klik button kirim pesan
      Then user seharusnya melihat komentar berhasil di muat

    @CLoseTiket
    Scenario: Close tiket pada contact us
      Given user berada di landing page
      When user klik link hubungi kami
      Then user seharusnya melihat form hubungi kami
      When user klik button lihat tiket anda
      Then user seharusnya melihat form lihat tiket anda
      When user input nomor tiket "MSN000018"
      And user input email tiket "klobdaya@gmail.com"
      And user klik button cari tiket
      Then user seharusnya melihat form tiket result
      When user klik button tutup
      Then user seharusnya melihat status tiket close

    @KirimTiketInvalid
    Scenario: Mengirimkan pertanyaan menggunakan data kosong
      Given user berada di landing page
      When user klik link hubungi kami
      And klik button kirim pesan
      Then user seharusnya melihat error message

    @CariTiketInvalid
    Scenario: cari tiket menggunakan data kosong
      Given user berada di landing page
      When user klik link hubungi kami
      And user klik button lihat tiket anda
      And user klik button cari tiket
      Then muncul alert tiket tidak di temukan
