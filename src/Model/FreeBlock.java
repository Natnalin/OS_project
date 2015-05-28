package Model;

public class FreeBlock {
	private DirectoryDataBlock directory_data ;
	private DirectoryMetadataBlock directory_metadata ;
	private FileDataBlock file_data;
	private FileMetadataBlock file_metadata ;
	private FreeBlockBitmap free_block_bitmap ;
	private SuperBlock super_block ;

}
